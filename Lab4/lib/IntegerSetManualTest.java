package lib;

public class IntegerSetManualTest{
    public static void run(){
        System.out.println("Starting IntegerSet Manual Tests");
        int passed = 0;
        int failed = 0;

        //Test1 : การสร้าง, เพิ่มข้อมูล, และการเรียงลำดับ
        System.out.println("Testing add() and sorting");
        IntegerSet a = new IntegerSet();
        a.add(1);
        a.add(2);
        a.add(3);
        String expected1 = "[1, 2, 3]";
        if(a.toString().equals(expected1)){
            System.out.println("PASSED : Add and sort works correctly.");
            passed++;
        }else {
            System.out.println("FAILED : Expected " + expected1 + "but got" + a.toString());
            failed++;

        }

        //Test2: น้อยไปมาก
        System.out.println("Testing add() and shorting");
        a.add(23);
        a.add(5);
        a.add(14);
        String expected2 = "[1, 2, 3, 5, 14, 23]";
        if(a.toString().equals(expected2)){
            System.out.println("PASSED : Add and sort works correcly.");
            passed++;
        }else {
            System.out.println("FAILED : Expected" + expected2 + "but got" + a.toString());
            failed++;
        }
        //Test 3: การลบข้อมูล
        System.out.println("Testing remove()");
        a.add(0);
        a.add(70);
        a.add(90);
        a.add(120);
        a.remove(-20);
        String expected3 = "[0, 1, 2, 3, 5, 14, 23, 70, 90, 120]";
        if(a.toString().equals(expected3)){
            System.out.println("PASSED : Remove works correcly.");
            passed++;
        }else {
            System.out.println("FAILED : Expected" + expected3 + "but got" + a.toString());
            failed++;

        }
        //Test 4: การตรวจสอบข้อมูล(contains)
        System.out.println("Testing contains()");
        if(a.contains(90)&& !a.contains(-20)){
            System.out.println("PASSED : Contains work correcly after removal");
            passed++;
        }
        //สรุปผล
        System.out.println("Test Summary");
        System.out.println("Passed : " + passed + "Failed : " + failed);
        if(failed == 0){
            System.out.println("Excellent! All tests passed");
        }else {
            System.out.println("Some tests failed");
        }


    }
}
