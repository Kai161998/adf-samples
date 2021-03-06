/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package test.model.client;

import oracle.jbo.client.remote.ViewUsageImpl;

import test.model.common.EmpView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 10 15:55:06 CEST 2009
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class EmpViewClient extends ViewUsageImpl implements EmpView {
    /**
     * This is the default constructor (do not remove).
     */
    public EmpViewClient() {
    }

    public String customViewObjectMethodWithResult(String stringArg,
                                                   int intArg) {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"customViewObjectMethodWithResult",new String [] {"java.lang.String","int"},new Object[] {stringArg, new Integer(intArg)});
        return (String)_ret;
    }


    public void customViewObjectMethod(String stringArg, int intArg) {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"customViewObjectMethod",new String [] {"java.lang.String","int"},new Object[] {stringArg, new Integer(intArg)});
        return;
    }

    public void customViewObjectMethodNoArgs() {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"customViewObjectMethodNoArgs",null,null);
        return;
    }

    public String customViewObjectMethodWithResult(String stringArg,
                                                   Integer intArg) {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"customViewObjectMethodWithResult",new String [] {"java.lang.String","java.lang.Integer"},new Object[] {stringArg, intArg});
        return (String)_ret;
    }

    public void customViewObjectMethod(String stringArg, Integer intArg) {
        Object _ret =
            getApplicationModuleProxy().riInvokeExportedMethod(this,"customViewObjectMethod",new String [] {"java.lang.String","java.lang.Integer"},new Object[] {stringArg, intArg});
        return;
    }
}
