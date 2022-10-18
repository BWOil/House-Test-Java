import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;
import java.io.File;
import java.util.Scanner;

public class House {
    //followed template from assignment 4

    private String houseID;
    private String houseAddress;
    private String houseType;  // such as Apartment, Unit, Townhouse, etc.
    private double housePrice;
    private int numBedrooms;
    private int numBathrooms;
    private int numCarspace; //number of available parking
    private double sizeHouse;
    private String descriptionHouse;

    public House(String id, String address, String type, double price, int bedrooms, int bathrooms, int carspace,
                 double size, String description) {
        houseID = id;
        houseAddress = address;
        houseType = type;
        housePrice = price;
        numBedrooms = bedrooms;
        numBathrooms = bathrooms;
        numCarspace = carspace;
        sizeHouse = size;
        descriptionHouse = description;

    }

    //1. Add house
    public boolean addHouse() throws IOException {

        if (checkHouseIdCondition(houseID) && checkHouseDescription(descriptionHouse)
                && checkRoomCondition(numBedrooms, numBathrooms) && checkSizeHouseAndHousePrice(sizeHouse, housePrice)
                && checkHouseTypeAndNumCarSpace(houseType, numCarspace)
                && checkHousePrice(housePrice) && checkNumRoomsAndHousePrice(numBedrooms, numBathrooms, housePrice)) {

            //write the .txt file
            String houseInfo = String.format("%s,%s,%s,%.2f,%d,%d,%d,%.2f,%s\n", houseID,
                    houseAddress, houseType, housePrice, numBedrooms, numBathrooms, numCarspace, sizeHouse,
                    descriptionHouse);


            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("houseInfo.txt", true));
                writer.write(houseInfo);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();

            }
            return true;
        }
        return false;
    }

    //2. Update house
    public boolean updateHouse(String newAddress, String newType, double newPrice, int newBedrooms, int newBathrooms,
                               int newCarspace, double newSize, String newDescription) {
        if ( checkHouseDescription(newDescription)
                && checkRoomCondition(newBedrooms, newBathrooms) && checkSizeHouseAndHousePrice(newSize, newPrice)
                && checkHouseTypeAndNumCarSpace(newType, newCarspace)
                && checkHousePrice(newPrice) && checkNumRoomsAndHousePrice(newBedrooms, newBathrooms, newPrice) &&
                checkIncreaseChangeHousePrice(newPrice, housePrice, numBedrooms) && checkHouseTypeBeforeUpdate(newAddress)
                && checkSizeHouseBeforeUpdate(sizeHouse, newSize)) {

            try { // Please note that some parts of the code were applied from
                // https://www.tutorialspoint.com/how-to-overwrite-a-line-in-a-txt-file-using-java#

                //Create the file path
                String filePath = "houseinfo.txt";
                //Create the Scanner class to read the file
                Scanner scn = new Scanner(new File(filePath));
                //Create the StringBuffer class
                StringBuffer buffer = new StringBuffer();
                //Reading lines of the file and appending them to StringBuffer
                while (scn.hasNextLine()) {
                    buffer.append(scn.nextLine() + System.lineSeparator());
                }
                String fileData = buffer.toString();
                //closing the Scanner object
                scn.close();
                String oldData = String.format("%s,%s,%s,%.2f,%d,%d,%d,%.2f,%s\n", houseID,
                        houseAddress, houseType, housePrice, numBedrooms, numBathrooms, numCarspace, sizeHouse,
                        descriptionHouse);
                String newData = String.format("%s,%s,%s,%.2f,%d,%d,%d,%.2f,%s\n", houseID,
                        newAddress, newType, newPrice, newBedrooms, newBathrooms, newCarspace, newSize,
                        newDescription);
                //Replacing the old line with new line
                fileData = fileData.replaceAll(oldData, newData);
                //instantiating the FileWriter class
                FileWriter writer = new FileWriter(filePath);
                writer.append(fileData);
                writer.flush();
            } catch(IOException e) {
                e.printStackTrace();

            }

            return true;
        }
        return false;

    }
    //Condition required by the assignment 4
    public boolean checkHouseIdCondition(String houseID) {
        if (houseID.length() == 10) {
            boolean isValidHouseID = true;
            for (int i = 0; i < 3; i++) {

                if (!Character.isUpperCase(houseID.charAt(i)))
                    isValidHouseID = false;

            }
            for (int i = 3; i < 10; i++) {
                char char_1 = houseID.charAt(i);
                if (!Character.isDigit(char_1) && char_1 == '0')
                    isValidHouseID = false;
            }
            return isValidHouseID;
        } else {
            return false;
        }
    }

    public boolean checkHouseDescription(String descriptionHouse) {

        //count word
        String[] words = descriptionHouse.split("\\s+");
        //condition
        return words.length >= 5 && words.length <= 10;
    }


    public boolean checkRoomCondition(int numBedrooms, int numBathrooms) {
        if (numBedrooms > 4) {
            return numBathrooms > 2;
        }

        return true;

    }

    public boolean checkSizeHouseAndHousePrice(double sizeHouse, double housePrice) {
        if (sizeHouse < 50) {
            return housePrice <= 350000;
        }
        return true;

    }

    public boolean checkHouseTypeAndNumCarSpace(String houseType, int numCarSpace) {
        if (Objects.equals(houseType, "Apartment")) {
            return numCarSpace >= 1;
        } else {
            return numCarSpace >= 0;
        }
    }

    public boolean checkHousePrice(double housePrice) {
        return housePrice >= 100000 && housePrice <= 1500000;
    }

    public boolean checkNumRoomsAndHousePrice(int numBedrooms, int numBathrooms, double housePrice) {
        if (numBedrooms < 3 && numBathrooms < 2) {
            return housePrice <= 750000;
        }
        return true;
    }

    public boolean checkIncreaseChangeHousePrice(double newPrice, double housePrice, int numBedrooms) {
        if ((newPrice - housePrice) / housePrice > 0){
            if (numBedrooms < 3) {
                return (newPrice - housePrice) / housePrice <= 0.1 ;
            } else {
                return (newPrice - housePrice) / housePrice <= 0.2;
            }
        }
        return true;
    }

    public boolean checkHouseTypeBeforeUpdate(String newAddress) {
        if (Objects.equals(houseType, "Townhouse")) {
            return newAddress.equals(houseAddress);
        }
        return true;

    }

    public boolean checkSizeHouseBeforeUpdate(double sizeHouse, double newSize) {
        if ((newSize - sizeHouse)/sizeHouse > 0) {
            if ((newSize - sizeHouse) / sizeHouse >= 0.05 && (newSize - sizeHouse) / sizeHouse <= 0.10) {
                return true;
            }
            return false;
        }return true;
    }
}
