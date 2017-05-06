

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class FamilyUnitTest
{
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    //                                     Family Constructor Tests
    //positive family constructor
    @Test
    public void TestFConstructorPostive()
    {
        Family example1 = new Family(1, "A", "1 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals(1, example1.getFamilyID());
        assertEquals("A", example1.getFamilyName());
        assertEquals("1 Dawn Lane", example1.getAddress());
        assertEquals("AppleDale", example1.getCity());
        assertEquals("RI", example1.getState());
        assertEquals("07054", example1.getZip());
    }
    //negative family constructor, 0 ID
    @Test
    public void TestFConstructor0ID()
    {
        Family example2 = new Family(0, "B", "2 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals(0, example2.getFamilyID());
        System.out.println("TestFConstructor0ID^^");
        //test that the error message comes up for entering a 0 ID
    }
    //negative family constructor, duplicate ID
    @Test
    public void TestFConstructorDup()
    {
        Family example3 = new Family(1, "C", "3 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals(0, example3.getFamilyID());
        System.out.println("TestFConstructorDup^^");
        //test that the error message comes up for entering a duplicate ID and doesnt change it
    }
    
    @Test
    public void TestFConstructorNullName()
    {
        Family example25 = new Family(25, null, "25 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals(25, example25.getFamilyID());
        System.out.println("TestFConstructorNullName^^");
        //test that the error message comes up for entering a null name
    }
    
    //                                          Get & Set Tests
    //                Set ID
    //positive setID test
    @Test
    public void TestFSetIDPositive()
    {
        Family example4 = new Family(4, "D", "4 Dawn Lane", "AppleDale", "RI", "07054");
        example4.hsSetID(3);
        assertEquals(3, example4.getFamilyID());
    }
    //negative setID test 0 ID
    @Test
    public void TestFSetID0ID()
    {
        Family example5 = new Family(5, "E", "5 Dawn Lane", "AppleDale", "RI", "07054");
        example5.hsSetID(0);
        assertEquals(5, example5.getFamilyID());
        System.out.println("TestFSetID0ID^^");
        //test that the error message comes up for entering a 0 ID
    }
    //negative setID test duplicate ID
    @Test
    public void TestFSetIDDup()
    {
        Family example6 = new Family(6, "F", "6 Dawn Lane", "AppleDale", "RI", "07054");
        example6.hsSetID(5);
        assertEquals(6, example6.getFamilyID());
        System.out.println("TestFSetIDDup^^");
        //test that the error message comes up for entering a duplicate ID and doesnt change it
    }
    
    //                 Get ID
    //positive getID test
    @Test
    public void TestFGetID()
    {
        Family example7 = new Family(7, "G", "7 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals(7, example7.getFamilyID());
    }
    
    //                Set Family Name
    //positive setFamilyName test
    @Test
    public void TestFSetFamilyName()
    {
        Family example8 = new Family(8, "H", "8 Dawn Lane", "AppleDale", "RI", "07054");
        example8.setFamilyName("h");
        assertEquals("h", example8.getFamilyName());
    }
    //negative setFamilyName test null
    @Test
    public void TestFSetFamilyNameNull()
    {
        Family example9 = new Family(9, "I", "9 Dawn Lane", "AppleDale", "RI", "07054");
        example9.setFamilyName(null);
        assertEquals("I", example9.getFamilyName());
        System.out.println("TestFSetFamilyNameNull^^");
        //test that the error message comes up for a null family name
    }
    
    //                 Get Family Name
    //positive getFamilyName test
    @Test
    public void TestFGetFamilyName()
    {
        Family example10 = new Family(10, "J", "10 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals("J", example10.getFamilyName());
    }
    
    //                 Address
    @Test
    public void TestFSetAddress()
    {
        Family example11 = new Family(11, "K", "11 Dawn Lane", "AppleDale", "RI", "07054");
        example11.setAddress("11B Dawn Lane");
        assertEquals("11B Dawn Lane", example11.getAddress());
    }
    @Test
    public void TestFGetAddress()
    {
        Family example12 = new Family(12, "L", "12 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals("12 Dawn Lane", example12.getAddress());
    }
    
    //                City
    @Test
    public void TestFSetCity()
    {
        Family example13 = new Family(13, "M", "13 Dawn Lane", "AppleDale", "RI", "07054");
        example13.setCity("OrangeDale");
        assertEquals("OrangeDale", example13.getCity());
    }
    @Test
    public void TestFGetCity()
    {
        Family example14 = new Family(14, "N", "14 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals("AppleDale", example14.getCity());
    }
    
    //               State
    @Test
    public void TestFSetState()
    {
        Family example15 = new Family(15, "O", "15 Dawn Lane", "AppleDale", "RI", "07054");
        example15.setState("NJ");
        assertEquals("NJ", example15.getState());
    }
    @Test
    public void TestFGetState()
    {
        Family example16 = new Family(16, "P", "16 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals("RI", example16.getState());
    }
    
    //                Zip
    @Test
    public void TestFSetZip()
    {
        Family example17 = new Family(17, "Q", "17 Dawn Lane", "AppleDale", "RI", "07054");
        example17.setZip("08096");
        assertEquals("08096", example17.getZip());
    }
    @Test
    public void TestFGetZip()
    {
        Family example18 = new Family(18, "R", "18 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals("07054", example18.getZip());
    }
    
    //                                       Other Method Tests
    //            Add Member
    @Test
    public void TestFAddMember()
    {
        Family example19 = new Family(19, "S", "19 Dawn Lane", "AppleDale", "RI", "07054");
        Member member1 = new Member(1, "A", "M");
        example19.addMember(member1);
        assertEquals(1, example19.FamilyMembers.size());
        //checks the size of the FamilyMembers arraylist to make sure it was added
    }
    
    @Test
    public void TestFAddMemberMultiple()
    {
        Family example20 = new Family(20, "T", "20 Dawn Lane", "AppleDale", "RI", "07054");
        Member member2 = new Member(2, "B", "M");
        Member member3 = new Member(3, "C", "F");
        example20.addMember(member2);
        example20.addMember(member3);
        assertEquals(2, example20.FamilyMembers.size());
        //checks to make sure the add member function works properly more than once
    }
    
    @Test
    public void TestGetMembers()
    {
        Family example21 = new Family(21, "U", "21 Dawn Lane", "AppleDale", "RI", "07054");
        Member member4 = new Member(4, "Da", "M");
        Member member5 = new Member(5, "Db", "F");
        Member member6 = new Member(6, "Dc", "T");
        
        assertEquals(example21.FamilyMembers, example21.getMembers());
        //checks to make sure the FamilyMembers arraylist added the members correctly
    }
    
    @Test
    public void TestGetMembersBySex()
    {
        Family example22 = new Family(22, "V", "22 Dawn Lane", "AppleDale", "RI", "07054");
        Member member7 = new Member(7, "E", "M");
        example22.addMember(member7);
        assertEquals(example22.FamilyMembers, example22.getMembers("M"));
        //Since the only one in FamilyMembers is M, this compares the arraylist returned by
        //getMember(string) to the FamilyMembers arraylist to make sure it returns the right info
    }
    
    @Test
    public void TestGetMembersBySexNeg()
    {
        Family example23 = new Family(23, "W", "23 Dawn Lane", "AppleDale", "RI", "07054");
        Member member8 = new Member(8, "F", "M");
        example23.addMember(member8);
        assertFalse(example23.FamilyMembers == example23.getMembers("F"));
        System.out.println("TestGetMembersBySexNeg^^");
        //tests that the error message comes up for invalid sex input
    }
    
    @Test
    public void TestToString()
    {
        Family example24 = new Family(24, "X", "24 Dawn Lane", "AppleDale", "RI", "07054");
        assertEquals("X24\n24 Dawn Lane\nAppleDale, RI 07054\n" , example24.toString());
    }
}
