/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test;
import oracle.jbo.Row;
import oracle.jbo.server.ApplicationModuleImpl;

import test.common.TestModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class TestModuleImpl extends ApplicationModuleImpl implements TestModule {
  /**This is the default constructor (do not remove)
   */
  public TestModuleImpl() {
  }

  /**Container's getter for DeptView1
   */
  public DeptViewImpl getDeptView1() {
    return (DeptViewImpl)findViewObject("DeptView1");
  }

  public void revertCurrentDeptView1Row() {
    Row r = getDeptView1().getCurrentRow();
    if (r != null) {
      r.refresh(Row.REFRESH_WITH_DB_FORGET_CHANGES);
    }
  }
  /**Sample main for debugging Business Components code using the tester.
   */
  public static void main(String[] args) {
    launchTester("test", /* package name */
      "TestModuleLocal" /* Configuration Name */);
  }
}
