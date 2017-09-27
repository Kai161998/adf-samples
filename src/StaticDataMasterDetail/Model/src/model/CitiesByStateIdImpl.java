/* Copyright 2010, 2017, Oracle and/or its affiliates. All rights reserved. */
package model;

import java.sql.ResultSet;

import oracle.adfbc.staticdata.CSVFileViewObjectImpl;

import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CitiesByStateIdImpl extends CSVFileViewObjectImpl {
  /**This is the default constructor (do not remove).
   */
  public CitiesByStateIdImpl() {
  }

  /**executeQueryForCollection - overridden for custom java data source support.
   */
  protected void executeQueryForCollection(Object qc, Object[] params, 
                                           int noUserParams) {
    super.executeQueryForCollection(qc, params, noUserParams);
  }

  /**hasNextForCollection - overridden for custom java data source support.
   */
  protected boolean hasNextForCollection(Object qc) {
    boolean bRet = super.hasNextForCollection(qc);
    return bRet;
  }

  /**createRowFromResultSet - overridden for custom java data source support.
   */
  protected ViewRowImpl createRowFromResultSet(Object qc, 
                                               ResultSet resultSet) {
    ViewRowImpl value = super.createRowFromResultSet(qc, resultSet);
    return value;
  }

  /**getEstimatedRowCount - overridden for custom java data source support.
   */
  public long getEstimatedRowCount() {
    long value = super.getEstimatedRowCount();
    return value;
  }

  /**Gets the bind variable value for TheStateId.
   */
  public Number getTheStateId() {
    return (Number)getNamedWhereClauseParam("TheStateId");
  }

  /**Sets <code>value</code> for bind variable TheStateId.
   */
  public void setTheStateId(Number value) {
    setNamedWhereClauseParam("TheStateId", value);
  }
}