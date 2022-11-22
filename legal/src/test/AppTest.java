package com.legal;
 
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api*;

public class AppTest
{

@BeforeAll
public static void runBeforeClass(){
    System.out.println("Runs before entire test suite");
}
@BeforeEach
public void runBeforeEachTest(){
    System.out.println("Runs Before each test");
}
@Disable
public void thisTestIsSkipped(){
    
}
@Test
public void shouldAnswerWithTrue()
{
    assertTrue( true);
}
@Test
public void assertDemo(){
    int expected = 10;
    int actual = -10;
    assertEquals("asserDemo fails", expected, actual);
}}

