import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class HouseTest {

    //--------------------Test case for add house function--------------------------------------
    @Test
    void testAddHouse_testcase1() throws IOException {
        //Check the function with valid inputs
        //Test Case 1_Test Data 1
        House houseTestCase1Data1 = new House("REA8329415", "181 Melbourne",
                "Apartment", 350000, 4,3, 1, 50.00,
                "Fully furnished unit near CBD");
//        assertTrue(houseTestCase1Data1.addHouse());
        //Test Case 1_Test Data 2
        House houseTestCase1Data2 = new House("ANB8784991", "253 Sydney", "Unit",
                100001 ,3, 4,5, 99.00,
                "Lavishly furnished room near Prahran Market");
//        assertTrue(houseTestCase1Data2.addHouse());
        //Test Case 1_Test Data 3
        House houseTestCase1Data3 = new House("RFD9753078", "999 Hobart", "Apartment",
                149999,3,2,1,49,
                "Stately Victorian Residence with Poolside Allure");
//        assertTrue(houseTestCase1Data3.addHouse());
        //Test Case 1_Test Data 4
        House houseTestCase1Data4 = new House("ANB8784991", "211 Pert", "Unit",
                750000,3,2,0,120.50, "in the heart of CBD");
//        assertTrue(houseTestCase1Data4.addHouse());

       assertAll("Should check the valid inputs",
               ()->assertTrue(houseTestCase1Data1.addHouse()),
               ()->assertTrue(houseTestCase1Data2.addHouse()),
               ()->assertTrue(houseTestCase1Data3.addHouse()),
               ()->assertTrue(houseTestCase1Data4.addHouse()));

    }
    @Test
    void testAddHouse_testcase2() throws IOException {
        //Check the function with invalid houseID
        //Test Case 2_Test Data 1
        House houseTestCase2Data1 = new House("amn7987", "32 Adelaide", "Townhouse",599000,
                4,3,1, 110.50,
                "Stately Victorian Residence with Poolside Allure");
//        assertFalse(houseTestCase2Data1.addHouse());
        //Test Case 2_Test Data 2
        House houseTestCase2Data2 = new House("76dre534j3", "211 Pert", "Unit",200000,
                3,4,2,120.50,"in the heart of CBD");
//        assertFalse(houseTestCase2Data2.addHouse());
        //Test Case 2_Test Data 3
        House houseTestCase2Data3 = new House("91j", "211 Pert", "Unit",750000,
                3,2,0,120.50, "in the heart of CBD");
//        assertFalse(houseTestCase2Data3.addHouse());
        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseTestCase2Data1.addHouse()),
                ()->assertFalse(houseTestCase2Data2.addHouse()),
                ()->assertFalse(houseTestCase2Data3.addHouse()));

    }
    @Test
    void testAddHouse_testcase3() throws IOException {
        //Check the function with invalid House Description
        //Test Case 3_Test Data 1
        House houseTestCase3Data1 = new House("JHT8910294", "212 Mackay", "Apartment",
                500000,4,2,1, 140.50, "Near CBD");
//        assertFalse(houseTestCase3Data1.addHouse());
        //Test Case 3_Test Data 2
        House houseTestCase3Data2 = new House("UHT8083274", "555 Port Macquarie", "Unit",
                100000,3,2,0,110.50,
                "Near St Kilda Street and shopping store and the beautiful beach");
//        assertFalse(houseTestCase3Data2.addHouse());
        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseTestCase3Data1.addHouse()),
                ()->assertFalse(houseTestCase3Data2.addHouse()));

    }
    @Test
    void testAddHouse_testcase4() throws IOException {
        //Check the function with an invalid number of bedrooms and invalid number of bathrooms
        //Test Case 4_Test Data 1
        House houseTestCase4Data1 = new House("LNM9386981", "88 Darwin", "Cottage",
                500000,5,2,1, 140.50,
                "Stately Victorian Residence with Poolside Allure");
//        assertFalse(houseTestCase4Data1.addHouse());
        //Test Case 4_Test Data 2
        House houseTestCase4Data2 = new House("MLK8402134", "300 Cairns", "Apartment",
                600000,5,1,1, 150.50, "in the heart of CBD");
//        assertFalse(houseTestCase4Data2.addHouse());
        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseTestCase4Data1.addHouse()),
                ()->assertFalse(houseTestCase4Data2.addHouse()));
    }
    @Test
    void testAddHouse_testcase5() throws IOException {
        //Check the function with an invalid house size and house price
        //Test Case 5_Test Data 1
        House houseTestCase5Data1 = new House("PLZ5328799", "677 Geelong", "Townhouse",
                700000,3,4,5, 49.99,
                "Stately Victorian Residence with Poolside Allure");
//        assertFalse(houseTestCase5Data1.addHouse());
        //Test Case 5_Test Data 2
        House houseTestCase5Data2 = new House("MUC3945681", "231 Ballarat", "Unit",
                350001,3,4,5, 20.50,
                "in the heart of CBD");
//        assertFalse(houseTestCase5Data2.addHouse());
        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseTestCase5Data1.addHouse()),
                ()->assertFalse(houseTestCase5Data2.addHouse()));
    }
    @Test
    void testAddHouse_testcase6() throws IOException {
        //Check the function with an invalid house type and invalid number of car space
        //Test Case 6_Test Data 1
        House houseTestCase6Data1 = new House("BLB8342243", "643 Mildura", "Apartment",
                900000,3,2,0, 90.50,
                "Stately Victorian Residence with Poolside Allure");
//        assertFalse(houseTestCase6Data1.addHouse());
        //Test Case 6_Test Data 2
        House houseTestCase6Data2 = new House("THH9986658", "321 Canberra", "Apartment",
                1000000,3,2,-4, 97.50,
                "in the heart of CBD");
//        assertFalse(houseTestCase6Data2.addHouse());
        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseTestCase6Data1.addHouse()),
                ()->assertFalse(houseTestCase6Data2.addHouse()));

    }
    @Test
    void testAddHouse_testcase7() throws IOException {
        //Check the function with invalid an invalid House Price
        //Test Case 7_Test Data 1
        House houseTestCase7Data1 = new House("ANB8784991", "253 Sydney", "Unit",
                99999, 3, 2,0, 99.00,
                "in the heart of CBD");
//        assertFalse(houseTestCase7Data1.addHouse());
        //Test Case 7_Test Data 2
        House houseTestCase7Data2 = new House("JHT8910294", "211 Pert", "Unit",
                1500001,3,4,2,120.50,
                "in the heart of CBD");
//        assertFalse(houseTestCase7Data2.addHouse());
        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseTestCase7Data1.addHouse()),
                ()->assertFalse(houseTestCase7Data2.addHouse()));

    }
    @Test
    void testAddHouse_testcase8() throws IOException {
        //Check the function with an invalid number of bedrooms, invalid number of bathrooms, and invalid house price
        //Test Case 8_Test Data 1
        House houseTestCase8Data1 = new House("BIT2073543", "666 Wollongong", "Unit",
                1600000,2,1,1,110.50,
                "Stately Victorian Residence with Poolside Allure");
//        assertFalse(houseTestCase8Data1.addHouse());
        //Test Case 8_Test Data 2
        House houseTestCase8Data2 = new House("HRE9985158", "312 Bendigo", "Townhouse",
                75001,1,2,1,80.50, "in the heart of CBD");
//        assertFalse(houseTestCase8Data2.addHouse());
        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseTestCase8Data1.addHouse()),
                ()->assertFalse(houseTestCase8Data2.addHouse()));

    }

    //---------------Test case for update house function-------------------------------
    @Test
    void testUpdateHouse_testcase1() throws IOException {
        //Check the function with valid inputs
        //Test Case 1_Test Data 1
        House houseUpdateTestCase1Data1 = new House("EEE8888999", "253 Sydney", "Unit",
                100001 ,3, 4,5, 99.00,
                "Lavishly furnished room near Prahran Market");
        houseUpdateTestCase1Data1.addHouse();
//        assertTrue(houseUpdateTestCase1Data1.updateHouse( "333 Sydney Harbour", "Unit",
//                110001.1 ,3, 4,5, 108.89,
//                "Newly renovated room near Prahran Market"));


        //Test Case 1_Test Data 2
        House houseUpdateTestCase1Data2 = new House("BIT2020333", "666 Wollongong", "Apartment",
                1200000,3,4,5,110.50,
                "Stately Victorian Residence with Poolside Allure");
        houseUpdateTestCase1Data2.addHouse();
//        assertTrue(houseUpdateTestCase1Data2.updateHouse("444 Wollongong Office", "Apartment",
//                1260000 ,3, 4,5, 116.025,
//                " Newly opened shared house in Wollonggong"));
        assertAll("Should check the valid inputs",
                ()->assertTrue(houseUpdateTestCase1Data1.updateHouse("333 Sydney Harbour", "Unit",
                        110001.1 ,3, 4,5, 108.89,
                        "Newly renovated room near Prahran Market")),
                ()->assertTrue(houseUpdateTestCase1Data2.updateHouse("444 Wollongong Office", "Apartment",
                        1260000 ,3, 4,5, 116.025,
                        " Newly opened shared house in Wollonggong")));

    }
    @Test
    void testUpdateHouse_testcase2() throws IOException {
        //Check the function with an invalid increased change in house price
        //Test Case 2_Test Data 1
        House houseUpdateTestCase2Data1 = new House("MLK8402134", "211 Pert", "Unit",
                200000,2,4,2,120.50,
                "in the heart of CBD");
        houseUpdateTestCase2Data1.addHouse();
//        assertFalse(houseUpdateTestCase2Data1.updateHouse("211 Pert", "Unit",
//                200000,2,4,2,120.50,
//                "in the heart of CBD"));
//
        //Test Case 2_Test Data 2
        House houseUpdateTestCase2Data2 = new House("HRE9985158", "312 Bendigo", "Unit",
                250000,4,4,5,80.50, "in the heart of CBD");
        houseUpdateTestCase2Data2.addHouse();
//        assertFalse(houseUpdateTestCase2Data2.updateHouse("312 Bendigo", "Unit",
//                250000,4,4,5,96.60,
//                "in the heart of CBD"));

        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseUpdateTestCase2Data1.updateHouse("211 Pert", "Unit",
                        222000,2,4,2,120.50,
                        "in the heart of CBD")),
                ()->assertFalse(houseUpdateTestCase2Data2.updateHouse("312 Bendigo", "Unit",
                        302500,4,4,5,96.60,
                        "in the heart of CBD")));

    }

    @Test
    void testUpdateHouse_testcase3() throws IOException {
        //Check the function with an invalid house type
        //Test Case 3_Test Data 1
        House houseUpdateTestCase3Data1 = new House("JHT8989894", "32 Adelaide", "Townhouse",
                599000,4,3,1, 110.50,
                "Stately Victorian Residence with Poolside Allure");
        houseUpdateTestCase3Data1.addHouse();
//        assertFalse(houseUpdateTestCase3Data1.updateHouse(  "200 New Adelaide", "Townhouse",
//                599000,4,3,1, 110.50,
//                "Stately Victorian Residence with Poolside Allure"));

        //Test Case 3_Test Data 2
        House houseUpdateTestCase3Data2 = new House("ABC1010101", "1032 Perth", "Townhouse",
                599000,4,3,1, 110.50,
                "Stately Victorian Residence with Poolside Allure");
        houseUpdateTestCase3Data2.addHouse();
//        assertFalse(houseUpdateTestCase3Data2.updateHouse("500 Pert City", "Townhouse",
//                599000,4,3,1, 110.50,
//                "Stately Victorian Residence with Poolside Allure"));

        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseUpdateTestCase3Data1.updateHouse("200 New Adelaide", "Townhouse",
                        599000,4,3,1, 110.50,
                        "Stately Victorian Residence with Poolside Allure")),
                ()->assertFalse(houseUpdateTestCase3Data2.updateHouse("500 Pert City", "Townhouse",
                599000,4,3,1, 110.50,
                "Stately Victorian Residence with Poolside Allure")));

    }

    @Test
    void testUpdateHouse_testcase4() throws IOException {
        //Check the function with an invalid house size
        //Test Case 4_Test Data 1
        House houseUpdateTestCase4Data1 = new House("MLK8402134", "211 Pert", "Unit",
                200000,3,4,2,120.50, "in the heart of CBD");
        houseUpdateTestCase4Data1.addHouse();
//        assertFalse(houseUpdateTestCase4Data1.updateHouse("MLK8402134", "211 Pert", "Unit",
//                200000,3,4,2,124.85, "in the heart of CBD"));

        //Test Case 4_Test Data 2
        House houseUpdateTestCase4Data2 = new House("HRE9985158", "312 Bendigo", "Unit",
                200000,3,4,2,80.50, "in the heart of CBD");
        houseUpdateTestCase4Data2.addHouse();
//        assertFalse(houseUpdateTestCase4Data2.updateHouse("HRE9985158", "312 Bendigo", "Unit",
//                200000,3,4,2,100.50, "in the heart of CBD"));

        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseUpdateTestCase4Data1.updateHouse("211 Pert", "Unit",
                200000,3,4,2,124.85, "in the heart of CBD")),
                ()->assertFalse(houseUpdateTestCase4Data2.updateHouse("312 Bendigo", "Unit",
                        200000,3,4,2,100.50, "in the heart of CBD")));

    }
    @Test
    void testUpdateHouse_testcase5() throws IOException {
        //Check the function with an invalid house type and house size
        //Test Case 5_Test Data 1
        House houseUpdateTestCase5Data1 = new House("LNM9386981", "88 Darwin", "Townhouse",
                500000,3, 4,5, 120.50,
                "Stately Victorian Residence with Poolside Allure");
        houseUpdateTestCase5Data1.addHouse();
//        assertFalse(houseUpdateTestCase5Data1.updateHouse("LNM9386981", "88 Darwin", "Townhouse",
//                500000,3, 4,5, 124.85,
//                "Stately Victorian Residence with Poolside Allure"));

        //Test Case 5_Test Data 2
        House houseUpdateTestCase5Data2 = new House("HRE9985158", "312 Bendigo", "Townhouse",
                200000,3,4,2,80.50, "in the heart of CBD");
        houseUpdateTestCase5Data2.addHouse();
//        assertFalse(houseUpdateTestCase5Data2.updateHouse("HRE9985158", "312 Bendigo", "Townhouse",
//                200000,3,4,2,100.50, "in the heart of CBD"));

        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseUpdateTestCase5Data1.updateHouse("88 Darwin",
                        "Townhouse", 500000,3, 4,5, 124.85,
                "Stately Victorian Residence with Poolside Allure")),
                ()->assertFalse(houseUpdateTestCase5Data2.updateHouse("312 Bendigo", "Townhouse",
                        200000,3,4,2,100.50, "in the heart of CBD")));

    }

    @Test
    void testUpdateHouse_testcase6() throws IOException {
        //Check the function with an invalid house price and house type
        //Test Case 6_Test Data 1
        House houseUpdateTestCase6Data1 = new House("LNM9386981", "88 Darwin", "Townhouse",
                200000,3, 4,5, 120.50,
                "Stately Victorian Residence with Poolside Allure");
        houseUpdateTestCase6Data1.addHouse();
//        assertFalse(houseUpdateTestCase6Data1.updateHouse("LNM9386981", "77/88 Old Darwin", "Townhouse",
//                222000,3, 4,5, 120.50,
//                "Stately Victorian Residence with Poolside Allure"));

        //Test Case 6_Test Data 2
        House houseUpdateTestCase6Data2 = new House("HRE9985158", "312 Bendigo", "Townhouse",
                250000,3,4,2,80.50, "in the heart of CBD");
        houseUpdateTestCase6Data2.addHouse();
//        assertFalse(houseUpdateTestCase6Data2.updateHouse("HRE9985158", "55/312 New Bendigo", "Townhouse",
//                302500,3,4,2,80.50, "in the heart of CBD"));

        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseUpdateTestCase6Data1.updateHouse("77/88 Old Darwin",
                        "Townhouse", 222000,3, 4,5, 120.50,
                        "Stately Victorian Residence with Poolside Allure")),
                ()->assertFalse(houseUpdateTestCase6Data2.updateHouse("55/312 New Bendigo", "Townhouse",
                        302500,3,4,2,80.50, "in the heart of CBD")));

    }
    @Test
    void testUpdateHouse_testcase7() throws IOException {
        //Check the function with an invalid house type and house price
        //Test Case 7_Test Data 1
        House houseUpdateTestCase7Data1 = new House("LNM9386981", "88 Darwin", "Townhouse",
                200000,3, 4,5, 120.50,
                "Stately Victorian Residence with Poolside Allure");
        houseUpdateTestCase7Data1.addHouse();
//        assertFalse(houseUpdateTestCase7Data1.updateHouse("LNM9386981", "77/88 Old Darwin", "Townhouse",
//                222000,3, 4,5, 124.50,
//                "Stately Victorian Residence with Poolside Allure"));

        //Test Case 7_Test Data 2
        House houseUpdateTestCase7Data2 = new House("HRE9985158", "312 Bendigo", "Townhouse",
                250000,3,4,2,80.50, "in the heart of CBD");
        houseUpdateTestCase7Data2.addHouse();
//        assertFalse(houseUpdateTestCase7Data2.updateHouse("HRE9985158", "55/312 New Bendigo", "Townhouse",
//                302500,3,4,2,100.50, "in the heart of CBD"));

        assertAll("Should check the invalid inputs",
                ()->assertFalse(houseUpdateTestCase7Data1.updateHouse("77/88 Old Darwin",
                        "Townhouse", 222000,3, 4,5, 124.85,
                        "Stately Victorian Residence with Poolside Allure")),
                ()->assertFalse(houseUpdateTestCase7Data2.updateHouse("55/312 New Bendigo", "Townhouse",
                        302500,3,4,2,100.50, "in the heart of CBD")));

    }


}