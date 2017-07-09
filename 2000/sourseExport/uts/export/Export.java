package uts.export;

/**
 * This type was created in VisualAge.
 */
public class Export extends java.awt.Frame implements com.ibm.objectcombobox.ComboBoxListListener, java.awt.event.ActionListener, java.awt.event.ItemListener, java.awt.event.TextListener, java.awt.event.WindowListener, java.beans.PropertyChangeListener {
	private java.awt.Button ivjButton1 = null;
	private java.awt.Button ivjButton2 = null;
	private java.awt.Button ivjButton3 = null;
	private java.awt.Button ivjButton4 = null;
	private java.awt.Button ivjButton5 = null;
	private java.awt.Button ivjButton6 = null;
	private java.awt.Button ivjButton7 = null;
	private java.awt.Panel ivjContentsPane = null;
	private java.awt.Panel ivjPanel1 = null;
	private java.awt.Panel ivjPanel2 = null;
	private java.awt.Panel ivjPanelA = null;
	private java.awt.Panel ivjPanelB = null;
	private java.awt.Panel ivjPanelMainCard = null;
	private java.awt.CardLayout ivjCardLayout1 = null;
	private uts.export.map.BolDatastore ivjBolDatastore1 = null;
	private uts.export.map.BolManager ivjBolManager1 = null;
	private uts.export.map.BolResultForm ivjBolResultForm1 = null;
	private com.ibm.ivj.eab.dab.IMessageBox ivjIMessageBox1 = null;
	private uts.export.map.Bol ivjBol1 = null;
	private java.awt.Label ivjLabel1 = null;
	private java.awt.Label ivjLabel10 = null;
	private java.awt.Button ivjLabel11 = null;
	private java.awt.Label ivjLabel12 = null;
	private java.awt.Button ivjLabel13 = null;
	private java.awt.Label ivjLabel14 = null;
	private java.awt.Button ivjLabel15 = null;
	private java.awt.Label ivjLabel16 = null;
	private java.awt.Button ivjLabel17 = null;
	private java.awt.Label ivjLabel18 = null;
	private java.awt.Button ivjLabel19 = null;
	private java.awt.Label ivjLabel2 = null;
	private java.awt.Label ivjLabel20 = null;
	private java.awt.Button ivjLabel21 = null;
	private java.awt.Label ivjLabel22 = null;
	private java.awt.Button ivjLabel23 = null;
	private java.awt.Label ivjLabel24 = null;
	private java.awt.Label ivjLabel25 = null;
	private java.awt.Label ivjLabel26 = null;
	private java.awt.Button ivjLabel3 = null;
	private java.awt.Label ivjLabel4 = null;
	private java.awt.Button ivjLabel5 = null;
	private java.awt.Label ivjLabel6 = null;
	private java.awt.Button ivjLabel7 = null;
	private java.awt.Label ivjLabel8 = null;
	private java.awt.Button ivjLabel9 = null;
	private java.awt.GridLayout ivjPanel2GridLayout = null;
	private java.awt.TextField ivjTextField1 = null;
	private java.awt.TextField ivjTextField10 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField11 = null;
	private java.awt.TextField ivjTextField12 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField13 = null;
	private java.awt.TextField ivjTextField14 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField15 = null;
	private java.awt.TextField ivjTextField16 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField17 = null;
	private java.awt.TextField ivjTextField18 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField19 = null;
	private java.awt.TextField ivjTextField2 = null;
	private java.awt.TextField ivjTextField20 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField21 = null;
	private java.awt.TextField ivjTextField22 = null;
	private java.awt.TextField ivjTextField23 = null;
	private java.awt.TextField ivjTextField24 = null;
	private java.awt.TextField ivjTextField25 = null;
	private java.awt.TextField ivjTextField26 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField3 = null;
	private java.awt.TextField ivjTextField4 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField5 = null;
	private java.awt.TextField ivjTextField6 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField7 = null;
	private java.awt.TextField ivjTextField8 = null;
	private com.ibm.objectcombobox.ObjectComboBox ivjTextField9 = null;
	private boolean ivjConnPtoP14Aligning = false;
	private boolean ivjConnPtoP15Aligning = false;
	private boolean ivjConnPtoP16Aligning = false;
	private boolean ivjConnPtoP17Aligning = false;
	private boolean ivjConnPtoP18Aligning = false;
	private boolean ivjConnPtoP19Aligning = false;
	private boolean ivjConnPtoP20Aligning = false;
	private boolean ivjConnPtoP21Aligning = false;
	private boolean ivjConnPtoP22Aligning = false;
	private boolean ivjConnPtoP23Aligning = false;
	private boolean ivjConnPtoP24Aligning = false;
	private boolean ivjConnPtoP25Aligning = false;
	private boolean ivjConnPtoP26Aligning = false;
	private boolean ivjConnPtoP27Aligning = false;
	private boolean ivjConnPtoP28Aligning = false;
	private boolean ivjConnPtoP3Aligning = false;
	private java.awt.GridLayout ivjPanel1GridLayout = null;
	private java.awt.Button ivjButton111 = null;
	private java.awt.Button ivjButton191 = null;
	private java.awt.Panel ivjContentsPane2 = null;
	private java.awt.Dialog ivjDialog11 = null;
	private java.awt.Label ivjLabel201 = null;
	private java.awt.Panel ivjPanel3 = null;
	private java.awt.GridLayout ivjPanel3GridLayout = null;
	private java.awt.Panel ivjPanel4 = null;
	private java.awt.Button ivjButton8 = null;
	private java.awt.Panel ivjContentsPane1 = null;
	private java.awt.Dialog ivjDialog1 = null;
	private java.awt.Label ivjLabel111 = null;
	private java.awt.Label ivjLabel31 = null;
	private java.awt.Label ivjLabel61 = null;
	private java.awt.Panel ivjPanel11 = null;
	private java.awt.GridLayout ivjPanel11GridLayout = null;
	private java.awt.Panel ivjPanel21 = null;
	private java.awt.TextField ivjTextField171 = null;
	private java.awt.TextField ivjTextField181 = null;
	private java.awt.TextField ivjTextField191 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList1 = null;
	private uts.export.map.QueryshipperbolManager ivjQueryshipperbolManager1 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList2 = null;
	private uts.export.map.QueryconsigneebolManager ivjQueryconsigneebolManager1 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList3 = null;
	private uts.export.map.QuerynotyfyaddressbolManager ivjQuerynotyfyaddressbolManager1 = null;
	private uts.export.map.QueryvesselbolManager ivjQueryvesselbolManager11 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList4 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList5 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList6 = null;
	private uts.export.map.QueryflagbolManager ivjQueryflagbolManager1 = null;
	private uts.export.map.QueryshipownerbolManager ivjQueryshipownerbolManager1 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList7 = null;
	private uts.export.map.QueryportofloadingbolManager ivjQueryportofloadingbolManager1 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList8 = null;
	private uts.export.map.QueryportofdischargebolManager ivjQueryportofdischargebolManager1 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList9 = null;
	private uts.export.map.QuerydistinationbolManager ivjQuerydistinationbolManager1 = null;
	private com.ibm.ivj.eab.dab.IList ivjIList91 = null;
	private uts.export.map.QueryfreightbolManager ivjQueryfreightbolManager1 = null;
	private java.awt.Button ivjButton10 = null;
	private java.awt.Button ivjButton12 = null;
	private java.awt.Button ivjButton13 = null;
	private java.awt.Button ivjButton14 = null;
	private java.awt.Button ivjButton15 = null;
	private java.awt.Button ivjButton16 = null;
	private java.awt.Button ivjButton17 = null;
	private java.awt.Button ivjButton18 = null;
	private java.awt.Button ivjButton19 = null;
	private java.awt.Button ivjButton21 = null;
	private java.awt.Button ivjButton211 = null;
	private java.awt.Button ivjButton9 = null;
	private java.awt.Panel ivjContentsPane11 = null;
	private java.awt.Dialog ivjDialogQuery = null;
	private com.ibm.ivj.eab.dab.IList ivjIList51 = null;
	private java.awt.Label ivjLabel121 = null;
	private java.awt.Label ivjLabel141 = null;
	private java.awt.Label ivjLabel151 = null;
	private java.awt.Label ivjLabel161 = null;
	private java.awt.Label ivjLabel171 = null;
	private java.awt.Label ivjLabel191 = null;
	private java.awt.Label ivjLabel192 = null;
	private java.awt.Panel ivjPaneButton = null;
	private java.awt.Panel ivjPaneCard = null;
	private java.awt.Panel ivjPanelDate = null;
	private java.awt.Panel ivjPanelFerst = null;
	private java.awt.Panel ivjPanelSouth = null;
	private java.awt.BorderLayout ivjPanelSouthBorderLayout = null;
	private java.awt.Panel ivjPanelViewer = null;
	private java.awt.GridLayout ivjPanelViewerGridLayout = null;
	private java.awt.TextArea ivjTextArea1 = null;
	private java.awt.TextField ivjTextField141 = null;
	private java.awt.TextField ivjTextField1411 = null;
	private java.awt.TextField ivjTextField14111 = null;
	private java.awt.TextField ivjTextField1412 = null;
	private java.awt.TextField ivjTextField142 = null;
	private java.awt.TextField ivjTextField143 = null;
	private java.awt.TextField ivjTextField201 = null;
	private java.awt.CardLayout ivjCardLayout2 = null;
/**
 * Constructor
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public Export() {
	super();
	initialize();
}
/**
 * Export constructor comment.
 * @param title java.lang.String
 */
public Export(String title) {
	super(title);
}
/**
 * Method to handle events for the ActionListener interface.
 * @param e java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void actionPerformed(java.awt.event.ActionEvent e) {
	// user code begin {1}
	// user code end
	if ((e.getSource() == getButton1()) ) {
		connEtoM1(e);
	}
	if ((e.getSource() == getButton3()) ) {
		connEtoM2(e);
	}
	if ((e.getSource() == getButton9()) ) {
		connEtoM6(e);
	}
	if ((e.getSource() == getButton111()) ) {
		connEtoM11(e);
	}
	if ((e.getSource() == getButton7()) ) {
		connEtoM13(e);
	}
	if ((e.getSource() == getButton5()) ) {
		connEtoM15(e);
	}
	if ((e.getSource() == getButton4()) ) {
		connEtoM9(e);
	}
	if ((e.getSource() == getButton6()) ) {
		connEtoM17(e);
	}
	if ((e.getSource() == getButton191()) ) {
		connEtoM19(e);
	}
	if ((e.getSource() == getLabel23()) ) {
		connEtoM20(e);
	}
	if ((e.getSource() == getButton8()) ) {
		connEtoC2(e);
	}
	if ((e.getSource() == getLabel3()) ) {
		connEtoM25(e);
	}
	if ((e.getSource() == getLabel5()) ) {
		connEtoM47(e);
	}
	if ((e.getSource() == getLabel7()) ) {
		connEtoM49(e);
	}
	if ((e.getSource() == getLabel13()) ) {
		connEtoM51(e);
	}
	if ((e.getSource() == getLabel9()) ) {
		connEtoM53(e);
	}
	if ((e.getSource() == getLabel11()) ) {
		connEtoM55(e);
	}
	if ((e.getSource() == getLabel15()) ) {
		connEtoM57(e);
	}
	if ((e.getSource() == getLabel17()) ) {
		connEtoM59(e);
	}
	if ((e.getSource() == getLabel19()) ) {
		connEtoM61(e);
	}
	if ((e.getSource() == getLabel21()) ) {
		connEtoM63(e);
	}
	if ((e.getSource() == getButton2()) ) {
		connEtoM65(e);
	}
	if ((e.getSource() == getButton14()) ) {
		connEtoM67(e);
	}
	if ((e.getSource() == getButton21()) ) {
		connEtoM69(e);
	}
	if ((e.getSource() == getButton13()) ) {
		connEtoM74(e);
	}
	if ((e.getSource() == getButton16()) ) {
		connEtoM76(e);
	}
	if ((e.getSource() == getButton15()) ) {
		connEtoM84(e);
	}
	if ((e.getSource() == getButton18()) ) {
		connEtoM88(e);
	}
	if ((e.getSource() == getButton19()) ) {
		connEtoM92(e);
	}
	if ((e.getSource() == getButton211()) ) {
		connEtoC3(e);
	}
	// user code begin {2}
	// user code end
}
/**
 * connEtoC1:  (Export.window.windowClosing(java.awt.event.WindowEvent) --> Export.dispose()V)
 * @param arg1 java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoC1(java.awt.event.WindowEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		this.dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoC2:  (Button8.action.actionPerformed(java.awt.event.ActionEvent) --> Export.setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;)
 * @return java.lang.String
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private String connEtoC2(java.awt.event.ActionEvent arg1) {
	String connEtoC2Result = null;
	try {
		// user code begin {1}
		// user code end
		connEtoC2Result = this.setData(getTextField181().getText(), getTextField191().getText(), getTextField171().getText());
		connEtoM22(connEtoC2Result);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
	return connEtoC2Result;
}
/**
 * connEtoC3:  (Button211.action.actionPerformed(java.awt.event.ActionEvent) --> Export.setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;)
 * @return java.lang.String
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private String connEtoC3(java.awt.event.ActionEvent arg1) {
	String connEtoC3Result = null;
	try {
		// user code begin {1}
		// user code end
		connEtoC3Result = this.setData(getTextField14111().getText(), getTextField1412().getText(), getTextField142().getText());
		connEtoM94(connEtoC3Result);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
	return connEtoC3Result;
}
/**
 * connEtoC4:  ( ( ( (Button211,action.actionPerformed(java.awt.event.ActionEvent) --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;),normalResult --> TextArea1,append(Ljava.lang.String;)V),normalResult --> TextArea1,append(Ljava.lang.String;)V).normalResult --> Export.setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;)
 * @return java.lang.String
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private String connEtoC4() {
	String connEtoC4Result = null;
	try {
		// user code begin {1}
		// user code end
		connEtoC4Result = this.setData(getTextField1411().getText(), getTextField141().getText(), getTextField143().getText());
		connEtoM96(connEtoC4Result);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
	return connEtoC4Result;
}
/**
 * connEtoM1:  (Button1.action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1.next(Ljava.awt.Container;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM1(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getCardLayout1().next(getPanelMainCard());
		connEtoM28();
		connEtoM29();
		connEtoM31();
		connEtoM33();
		connEtoM35();
		connEtoM37();
		connEtoM39();
		connEtoM41();
		connEtoM43();
		connEtoM45();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM10:  ( (Button4,action.actionPerformed(java.awt.event.ActionEvent) --> Bol1,insert(SLjava.sql.Date;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.math.BigDecimal;Ljava.math.BigDecimal;Ljava.lang.String;)V).exceptionOccurred --> IMessageBox1.showException(Ljava.lang.Throwable;)V)
 * @param exception java.lang.Throwable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM10(Throwable exception) {
	try {
		// user code begin {1}
		// user code end
		getIMessageBox1().showException(exception);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM11:  (Button6.action.actionPerformed(java.awt.event.ActionEvent) --> Bol1.delete()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM11(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getBol1().delete();
		connEtoM24();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		connEtoM12(ivjExc);
	}
}
/**
 * connEtoM12:  ( (Button6,action.actionPerformed(java.awt.event.ActionEvent) --> Bol1,delete()V).exceptionOccurred --> IMessageBox1.showException(Ljava.lang.Throwable;)V)
 * @param exception java.lang.Throwable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM12(Throwable exception) {
	try {
		// user code begin {1}
		// user code end
		getIMessageBox1().showException(exception);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM13:  (Button7.action.actionPerformed(java.awt.event.ActionEvent) --> Bol1.retrieve()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM13(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getBol1().retrieve();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		connEtoM14(ivjExc);
	}
}
/**
 * connEtoM14:  ( (Button7,action.actionPerformed(java.awt.event.ActionEvent) --> Bol1,retrieve()V).exceptionOccurred --> IMessageBox1.showException(Ljava.lang.Throwable;)V)
 * @param exception java.lang.Throwable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM14(Throwable exception) {
	try {
		// user code begin {1}
		// user code end
		getIMessageBox1().showException(exception);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM15:  (Button5.action.actionPerformed(java.awt.event.ActionEvent) --> Bol1.update()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM15(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getBol1().update();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		connEtoM16(ivjExc);
	}
}
/**
 * connEtoM16:  ( (Button5,action.actionPerformed(java.awt.event.ActionEvent) --> Bol1,update()V).exceptionOccurred --> IMessageBox1.showException(Ljava.lang.Throwable;)V)
 * @param exception java.lang.Throwable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM16(Throwable exception) {
	try {
		// user code begin {1}
		// user code end
		getIMessageBox1().showException(exception);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM17:  (Button6.action.actionPerformed(java.awt.event.ActionEvent) --> Dialog11.show()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM17(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getDialog11().show();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM18:  (Dialog11.window.windowClosing(java.awt.event.WindowEvent) --> Dialog11.dispose()V)
 * @param arg1 java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM18(java.awt.event.WindowEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getDialog11().dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM19:  (Button191.action.actionPerformed(java.awt.event.ActionEvent) --> Dialog11.dispose()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM19(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getDialog11().dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM2:  (Button3.action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1.first(Ljava.awt.Container;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM2(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getCardLayout1().first(getPanelMainCard());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM20:  (TextField23.action.actionPerformed(java.awt.event.ActionEvent) --> Dialog1.show()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM20(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getDialog1().show();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM21:  (Dialog1.window.windowClosing(java.awt.event.WindowEvent) --> Dialog1.dispose()V)
 * @param arg1 java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM21(java.awt.event.WindowEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getDialog1().dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM22:  ( (Button8,action.actionPerformed(java.awt.event.ActionEvent) --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;).normalResult --> TextField23.text)
 * @param result java.lang.String
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM22(String result) {
	try {
		// user code begin {1}
		// user code end
		getTextField23().setText(result);
		connEtoM23();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM23:  ( ( (Button8,action.actionPerformed(java.awt.event.ActionEvent) --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;),normalResult --> TextField23,text).normalResult --> Dialog1.dispose()V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM23() {
	try {
		// user code begin {1}
		// user code end
		getDialog1().dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM24:  ( (Button111,action.actionPerformed(java.awt.event.ActionEvent) --> Bol1,delete()V).normalResult --> Dialog11.dispose()V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM24() {
	try {
		// user code begin {1}
		// user code end
		getDialog11().dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM25:  (Label3.action.actionPerformed(java.awt.event.ActionEvent) --> QueryshipperbolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM25(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQueryshipperbolManager1().select("order by shipper");
		connEtoM26();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM26:  ( (Label3,action.actionPerformed(java.awt.event.ActionEvent) --> QueryshipperbolManager1,select(Ljava.lang.String;)V).normalResult --> TextField3.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM26() {
	try {
		// user code begin {1}
		// user code end
		getTextField3().setListItems(getIList1().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM27:  (TextField3.listEvent. --> Bol1.setShipper(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM27() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setShipper(String.valueOf(getTextField3().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM28:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField3.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM28() {
	try {
		// user code begin {1}
		// user code end
		getTextField3().setText(getBol1().getShipper());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM29:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField5.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM29() {
	try {
		// user code begin {1}
		// user code end
		getTextField5().setText(getBol1().getConsignee());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM3:  (Export.window.windowOpened(java.awt.event.WindowEvent) --> BolDatastore1.connect(Ljava.lang.String;Ljava.lang.String;)V)
 * @param arg1 java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM3(java.awt.event.WindowEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getBolDatastore1().connect("admin", "1010");
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		connEtoM5(ivjExc);
	}
}
/**
 * connEtoM30:  (TextField5.listEvent. --> Bol1.setConsignee(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM30() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setConsignee(String.valueOf(getTextField5().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM31:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField7.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM31() {
	try {
		// user code begin {1}
		// user code end
		getTextField7().setText(getBol1().getNotifyaddress());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM32:  (TextField7.listEvent. --> Bol1.setNotifyaddress(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM32() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setNotifyaddress(String.valueOf(getTextField7().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM33:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField9.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM33() {
	try {
		// user code begin {1}
		// user code end
		getTextField9().setText(getBol1().getShipowner());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM34:  (TextField9.listEvent. --> Bol1.setShipowner(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM34() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setShipowner(String.valueOf(getTextField9().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM35:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField11.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM35() {
	try {
		// user code begin {1}
		// user code end
		getTextField11().setText(getBol1().getFlag());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM36:  (TextField11.listEvent. --> Bol1.setFlag(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM36() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setFlag(String.valueOf(getTextField11().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM37:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField13.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM37() {
	try {
		// user code begin {1}
		// user code end
		getTextField13().setText(getBol1().getVessel());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM38:  (TextField13.listEvent. --> Bol1.setVessel(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM38() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setVessel(String.valueOf(getTextField13().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM39:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField15.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM39() {
	try {
		// user code begin {1}
		// user code end
		getTextField15().setText(getBol1().getPortofloading());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM4:  (Export.window.windowClosed(java.awt.event.WindowEvent) --> BolDatastore1.disconnect()V)
 * @param arg1 java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM4(java.awt.event.WindowEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getBolDatastore1().disconnect();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM40:  (TextField15.listEvent. --> Bol1.setPortofloading(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM40() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setPortofloading(String.valueOf(getTextField15().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM41:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField17.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM41() {
	try {
		// user code begin {1}
		// user code end
		getTextField17().setText(getBol1().getPortofdischarge());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM42:  (TextField17.listEvent. --> Bol1.setPortofdischarge(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM42() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setPortofdischarge(String.valueOf(getTextField17().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM43:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField19.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM43() {
	try {
		// user code begin {1}
		// user code end
		getTextField19().setText(getBol1().getDistination());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM44:  (TextField19.listEvent. --> Bol1.setDistination(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM44() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setDistination(String.valueOf(getTextField19().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM45:  ( (Button1,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout1,next(Ljava.awt.Container;)V).normalResult --> TextField21.setText(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM45() {
	try {
		// user code begin {1}
		// user code end
		getTextField21().setText(getBol1().getFreight1());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM46:  (TextField21.listEvent. --> Bol1.setFreight1(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM46() {
	try {
		// user code begin {1}
		// user code end
		getBol1().setFreight1(String.valueOf(getTextField21().getSelectedItem()));
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM47:  (Label5.action.actionPerformed(java.awt.event.ActionEvent) --> QueryconsigneebolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM47(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQueryconsigneebolManager1().select("order by consignee");
		connEtoM48();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM48:  ( (Label5,action.actionPerformed(java.awt.event.ActionEvent) --> QueryconsigneebolManager1,select(Ljava.lang.String;)V).normalResult --> TextField5.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM48() {
	try {
		// user code begin {1}
		// user code end
		getTextField5().setListItems(getIList2().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM49:  (Label7.action.actionPerformed(java.awt.event.ActionEvent) --> QuerynotyfyaddressbolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM49(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQuerynotyfyaddressbolManager1().select("order by notifyaddress");
		connEtoM50();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM5:  ( (Export,window.windowOpened(java.awt.event.WindowEvent) --> BolDatastore1,connect(Ljava.lang.String;Ljava.lang.String;)V).exceptionOccurred --> IMessageBox1.showException(Ljava.lang.Throwable;)V)
 * @param exception java.lang.Throwable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM5(Throwable exception) {
	try {
		// user code begin {1}
		// user code end
		getIMessageBox1().showException(exception);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM50:  ( (Label7,action.actionPerformed(java.awt.event.ActionEvent) --> QuerynotyfyaddressbolManager1,select(Ljava.lang.String;)V).normalResult --> TextField7.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM50() {
	try {
		// user code begin {1}
		// user code end
		getTextField7().setListItems(getIList3().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM51:  (Label13.action.actionPerformed(java.awt.event.ActionEvent) --> QueryvesselbolManager11.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM51(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQueryvesselbolManager11().select("order by vessel");
		connEtoM52();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM52:  ( (Label13,action.actionPerformed(java.awt.event.ActionEvent) --> QueryvesselbolManager11,select(Ljava.lang.String;)V).normalResult --> TextField13.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM52() {
	try {
		// user code begin {1}
		// user code end
		getTextField13().setListItems(getIList6().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM53:  (Label9.action.actionPerformed(java.awt.event.ActionEvent) --> QueryshipownerbolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM53(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQueryshipownerbolManager1().select("order by shipowner");
		connEtoM54();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM54:  ( (Label9,action.actionPerformed(java.awt.event.ActionEvent) --> QueryshipownerbolManager1,select(Ljava.lang.String;)V).normalResult --> TextField9.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM54() {
	try {
		// user code begin {1}
		// user code end
		getTextField9().setListItems(getIList4().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM55:  (Label11.action.actionPerformed(java.awt.event.ActionEvent) --> QueryflagbolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM55(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQueryflagbolManager1().select("order by flag");
		connEtoM56();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM56:  ( (Label11,action.actionPerformed(java.awt.event.ActionEvent) --> QueryflagbolManager1,select(Ljava.lang.String;)V).normalResult --> TextField11.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM56() {
	try {
		// user code begin {1}
		// user code end
		getTextField11().setListItems(getIList5().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM57:  (Label15.action.actionPerformed(java.awt.event.ActionEvent) --> QueryportofloadingbolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM57(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQueryportofloadingbolManager1().select("order by portofloading");
		connEtoM58();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM58:  ( (Label15,action.actionPerformed(java.awt.event.ActionEvent) --> QueryportofloadingbolManager1,select(Ljava.lang.String;)V).normalResult --> TextField15.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM58() {
	try {
		// user code begin {1}
		// user code end
		getTextField15().setListItems(getIList7().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM59:  (Label17.action.actionPerformed(java.awt.event.ActionEvent) --> QueryportofdischargebolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM59(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQueryportofdischargebolManager1().select("order by portofdischarge");
		connEtoM60();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM6:  (Button2.action.actionPerformed(java.awt.event.ActionEvent) --> BolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM6(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getBolManager1().select(getTextArea1().getText());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		connEtoM7(ivjExc);
	}
}
/**
 * connEtoM60:  ( (Label17,action.actionPerformed(java.awt.event.ActionEvent) --> QueryportofdischargebolManager1,select(Ljava.lang.String;)V).normalResult --> TextField17.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM60() {
	try {
		// user code begin {1}
		// user code end
		getTextField17().setListItems(getIList8().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM61:  (Label19.action.actionPerformed(java.awt.event.ActionEvent) --> QuerydistinationbolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM61(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQuerydistinationbolManager1().select("order by distination");
		connEtoM62();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM62:  ( (Label19,action.actionPerformed(java.awt.event.ActionEvent) --> QuerydistinationbolManager1,select(Ljava.lang.String;)V).normalResult --> TextField19.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM62() {
	try {
		// user code begin {1}
		// user code end
		getTextField19().setListItems(getIList9().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM63:  (Label21.action.actionPerformed(java.awt.event.ActionEvent) --> QueryfreightbolManager1.select(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM63(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getQueryfreightbolManager1().select("order by freight1");
		connEtoM64();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM64:  ( (Label21,action.actionPerformed(java.awt.event.ActionEvent) --> QueryfreightbolManager1,select(Ljava.lang.String;)V).normalResult --> TextField21.setListItems([Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM64() {
	try {
		// user code begin {1}
		// user code end
		getTextField21().setListItems(getIList91().getItems());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM65:  (Button2.action.actionPerformed(java.awt.event.ActionEvent) --> DialogQuery.show()V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM65(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getDialogQuery().show();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM66:  (DialogQuery.window.windowClosing(java.awt.event.WindowEvent) --> DialogQuery.dispose()V)
 * @param arg1 java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM66(java.awt.event.WindowEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getDialogQuery().dispose();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM67:  (Button14.action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2.show(Ljava.awt.Container;Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM67(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getCardLayout2().show(getPaneCard(), getPanelFerst().getName());
		connEtoM68();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM68:  ( (Button14,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,show(Ljava.awt.Container;Ljava.lang.String;)V).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM68() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append("N in(");
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM69:  (Button21.action.actionPerformed(java.awt.event.ActionEvent) --> TextArea1.append(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM69(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append(getTextField201().getText());
		connEtoM70();
		connEtoM71();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM7:  ( (Button2,action.actionPerformed(java.awt.event.ActionEvent) --> BolManager1,select(Ljava.lang.String;)V).exceptionOccurred --> IMessageBox1.showException(Ljava.lang.Throwable;)V)
 * @param exception java.lang.Throwable
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM7(Throwable exception) {
	try {
		// user code begin {1}
		// user code end
		getIMessageBox1().showException(exception);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM70:  ( (Button21,action.actionPerformed(java.awt.event.ActionEvent) --> TextArea1,append(Ljava.lang.String;)V).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM70() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append(")");
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM71:  ( (Button21,action.actionPerformed(java.awt.event.ActionEvent) --> TextArea1,append(Ljava.lang.String;)V).normalResult --> CardLayout2.first(Ljava.awt.Container;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM71() {
	try {
		// user code begin {1}
		// user code end
		getCardLayout2().first(getPaneCard());
		connEtoM72();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM72:  ( ( (Button21,action.actionPerformed(java.awt.event.ActionEvent) --> TextArea1,append(Ljava.lang.String;)V),normalResult --> CardLayout2,first(Ljava.awt.Container;)V).normalResult --> PanelViewer.enabled)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM72() {
	try {
		// user code begin {1}
		// user code end
		getPanelViewer().setEnabled(false);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM73:  ( (Button13,action.actionPerformed(java.awt.event.ActionEvent) --> TextArea1,text).normalResult --> CardLayout2.first(Ljava.awt.Container;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM73() {
	try {
		// user code begin {1}
		// user code end
		getCardLayout2().first(getPaneCard());
		connEtoM75();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM74:  (Button13.action.actionPerformed(java.awt.event.ActionEvent) --> TextArea1.text)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM74(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().setText("where ");
		connEtoM73();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM75:  ( ( (Button13,action.actionPerformed(java.awt.event.ActionEvent) --> TextArea1,text),normalResult --> CardLayout2,first(Ljava.awt.Container;)V).normalResult --> PanelViewer.enabled)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM75() {
	try {
		// user code begin {1}
		// user code end
		getPanelViewer().setEnabled(true);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM76:  (Button16.action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2.last(Ljava.awt.Container;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM76(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getCardLayout2().last(getPaneCard());
		connEtoM77();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM77:  ( (Button16,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V).normalResult --> QueryshipperbolManager1.select(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM77() {
	try {
		// user code begin {1}
		// user code end
		getQueryshipperbolManager1().select("order by shipper");
		connEtoM78();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM78:  ( ( (Button16,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V),normalResult --> QueryshipperbolManager1,select(Ljava.lang.String;)V).normalResult --> IList51.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM78() {
	try {
		// user code begin {1}
		// user code end
		getIList51().setElements(getQueryshipperbolManager1().items());
		connEtoM79();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM79:  ( ( ( (Button16,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V),normalResult --> QueryshipperbolManager1,select(Ljava.lang.String;)V),normalResult --> IList51,elements).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM79() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append("shipper = \'");
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM8:  (BolResultForm1.item.itemStateChanged(java.awt.event.ItemEvent) --> Bol1.this)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM8(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		setBol1((uts.export.map.Bol)getBolResultForm1().getSelectedObject());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM80:  (IList51.item.itemStateChanged(java.awt.event.ItemEvent) --> TextArea1.append(Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM80(java.awt.event.ItemEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append(getIList51().getSelectedItem());
		connEtoM81();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM81:  ( (IList51,item.itemStateChanged(java.awt.event.ItemEvent) --> TextArea1,append(Ljava.lang.String;)V).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM81() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append("\'");
		connEtoM82();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM82:  ( ( (IList51,item.itemStateChanged(java.awt.event.ItemEvent) --> TextArea1,append(Ljava.lang.String;)V),normalResult --> TextArea1,append(Ljava.lang.String;)V).normalResult --> CardLayout2.first(Ljava.awt.Container;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM82() {
	try {
		// user code begin {1}
		// user code end
		getCardLayout2().first(getPaneCard());
		connEtoM83();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM83:  ( ( ( (IList51,item.itemStateChanged(java.awt.event.ItemEvent) --> TextArea1,append(Ljava.lang.String;)V),normalResult --> TextArea1,append(Ljava.lang.String;)V),normalResult --> CardLayout2,first(Ljava.awt.Container;)V).normalResult --> PanelViewer.enabled)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM83() {
	try {
		// user code begin {1}
		// user code end
		getPanelViewer().setEnabled(false);
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM84:  (Button15.action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2.last(Ljava.awt.Container;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM84(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getCardLayout2().last(getPaneCard());
		connEtoM85();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM85:  ( (Button15,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V).normalResult --> QueryconsigneebolManager1.select(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM85() {
	try {
		// user code begin {1}
		// user code end
		getQueryconsigneebolManager1().select("order by consignee");
		connEtoM86();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM86:  ( ( (Button15,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V),normalResult --> QueryconsigneebolManager1,select(Ljava.lang.String;)V).normalResult --> IList51.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM86() {
	try {
		// user code begin {1}
		// user code end
		getIList51().setElements(getQueryconsigneebolManager1().items());
		connEtoM87();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM87:  ( ( ( (Button15,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V),normalResult --> QueryconsigneebolManager1,select(Ljava.lang.String;)V),normalResult --> IList51,elements).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM87() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append("consignee = \'");
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM88:  (Button18.action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2.last(Ljava.awt.Container;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM88(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getCardLayout2().last(getPaneCard());
		connEtoM89();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM89:  ( (Button18,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V).normalResult --> QueryvesselbolManager11.select(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM89() {
	try {
		// user code begin {1}
		// user code end
		getQueryvesselbolManager11().select("order by vessel");
		connEtoM90();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM9:  (Button4.action.actionPerformed(java.awt.event.ActionEvent) --> Bol1.insert(SLjava.sql.Date;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;Ljava.math.BigDecimal;Ljava.math.BigDecimal;Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM9(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		uts.export.map.Bol.insert(Short.parseShort(getTextField1().getText()), java.sql.Date.valueOf(getTextField23().getText()), getTextField3().getText(), getTextField5().getText(), getTextField7().getText(), getTextField9().getText(), getTextField11().getText(), getTextField13().getText(), getTextField15().getText(), getTextField17().getText(), getTextField19().getText(), getTextField21().getText(), getTextField25().getText(), getTextField22().getText(), getTextField16().getText(), getTextField18().getText(), getTextField20().getText(), getTextField2().getText(), getTextField14().getText(), getTextField8().getText(), getTextField6().getText(), getTextField4().getText(), getTextField26().getText(), new java.math.BigDecimal(getTextField10().getText()), new java.math.BigDecimal(getTextField12().getText()), getTextField24().getText());
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		connEtoM10(ivjExc);
	}
}
/**
 * connEtoM90:  ( ( (Button18,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V),normalResult --> QueryvesselbolManager11,select(Ljava.lang.String;)V).normalResult --> IList51.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM90() {
	try {
		// user code begin {1}
		// user code end
		getIList51().setElements(getQueryvesselbolManager11().items());
		connEtoM91();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM91:  ( ( ( (Button18,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,last(Ljava.awt.Container;)V),normalResult --> QueryvesselbolManager11,select(Ljava.lang.String;)V),normalResult --> IList51,elements).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM91() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append("vessel = \'");
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM92:  (Button19.action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2.show(Ljava.awt.Container;Ljava.lang.String;)V)
 * @param arg1 java.awt.event.ActionEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM92(java.awt.event.ActionEvent arg1) {
	try {
		// user code begin {1}
		// user code end
		getCardLayout2().show(getPaneCard(), getPanelDate().getName());
		connEtoM93();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM93:  ( (Button19,action.actionPerformed(java.awt.event.ActionEvent) --> CardLayout2,show(Ljava.awt.Container;Ljava.lang.String;)V).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM93() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append("idate between \'");
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM94:  ( (Button211,action.actionPerformed(java.awt.event.ActionEvent) --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 * @param result java.lang.String
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM94(String result) {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append(result);
		connEtoM95();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM95:  ( ( (Button211,action.actionPerformed(java.awt.event.ActionEvent) --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;),normalResult --> TextArea1,append(Ljava.lang.String;)V).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM95() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append("\' and \'");
		connEtoC4();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM96:  ( ( ( ( (Button211,action.actionPerformed(java.awt.event.ActionEvent) --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;),normalResult --> TextArea1,append(Ljava.lang.String;)V),normalResult --> TextArea1,append(Ljava.lang.String;)V),normalResult --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 * @param result java.lang.String
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM96(String result) {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append(result);
		connEtoM97();
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connEtoM97:  ( ( ( ( ( (Button211,action.actionPerformed(java.awt.event.ActionEvent) --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;),normalResult --> TextArea1,append(Ljava.lang.String;)V),normalResult --> TextArea1,append(Ljava.lang.String;)V),normalResult --> Export,setData(Ljava.lang.String;Ljava.lang.String;Ljava.lang.String;)Ljava.lang.String;),normalResult --> TextArea1,append(Ljava.lang.String;)V).normalResult --> TextArea1.append(Ljava.lang.String;)V)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connEtoM97() {
	try {
		// user code begin {1}
		// user code end
		getTextArea1().append("\'");
		// user code begin {2}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP10SetTarget:  (QueryportofdischargebolManager1.items <--> IList8.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP10SetTarget() {
	/* Set the target from the source */
	try {
		getIList8().setElements(getQueryportofdischargebolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP11SetTarget:  (QuerydistinationbolManager1.items <--> IList9.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP11SetTarget() {
	/* Set the target from the source */
	try {
		getIList9().setElements(getQuerydistinationbolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP12SetTarget:  (QueryfreightbolManager1.items <--> IList91.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP12SetTarget() {
	/* Set the target from the source */
	try {
		getIList91().setElements(getQueryfreightbolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP13SetSource:  (PaneCard.layout <--> CardLayout2.this)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP13SetSource() {
	/* Set the source from the target */
	try {
		getPaneCard().setLayout(getCardLayout2());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP13SetTarget:  (PaneCard.layout <--> CardLayout2.this)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP13SetTarget() {
	/* Set the target from the source */
	try {
		setCardLayout2((java.awt.CardLayout)getPaneCard().getLayout());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP14SetSource:  (Bol1.idate <--> TextField23.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP14SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP14Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP14Aligning = true;
			getBol1().setIdate(java.sql.Date.valueOf(getTextField23().getText()));
			// user code begin {2}
			// user code end
			ivjConnPtoP14Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP14Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP14SetTarget:  (Bol1.idate <--> TextField23.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP14SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP14Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP14Aligning = true;
			getTextField23().setText(String.valueOf(getBol1().getIdate()));
			// user code begin {2}
			// user code end
			ivjConnPtoP14Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP14Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP15SetSource:  (Bol1.master <--> TextField25.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP15SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP15Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP15Aligning = true;
			getBol1().setMaster(getTextField25().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP15Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP15Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP15SetTarget:  (Bol1.master <--> TextField25.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP15SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP15Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP15Aligning = true;
			getTextField25().setText(getBol1().getMaster());
			// user code begin {2}
			// user code end
			ivjConnPtoP15Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP15Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP16SetSource:  (Bol1.name <--> TextField2.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP16SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP16Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP16Aligning = true;
			getBol1().setName(getTextField2().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP16Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP16Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP16SetTarget:  (Bol1.name <--> TextField2.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP16SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP16Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP16Aligning = true;
			getTextField2().setText(getBol1().getName());
			// user code begin {2}
			// user code end
			ivjConnPtoP16Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP16Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP17SetSource:  (Bol1.namerus <--> TextField4.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP17SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP17Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP17Aligning = true;
			getBol1().setNamerus(getTextField4().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP17Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP17Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP17SetTarget:  (Bol1.namerus <--> TextField4.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP17SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP17Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP17Aligning = true;
			getTextField4().setText(getBol1().getNamerus());
			// user code begin {2}
			// user code end
			ivjConnPtoP17Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP17Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP18SetSource:  (Bol1.weight <--> TextField6.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP18SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP18Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP18Aligning = true;
			getBol1().setWeight(getTextField6().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP18Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP18Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP18SetTarget:  (Bol1.weight <--> TextField6.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP18SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP18Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP18Aligning = true;
			getTextField6().setText(getBol1().getWeight());
			// user code begin {2}
			// user code end
			ivjConnPtoP18Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP18Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP19SetSource:  (Bol1.quantity <--> TextField8.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP19SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP19Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP19Aligning = true;
			getBol1().setQuantity(getTextField8().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP19Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP19Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP19SetTarget:  (Bol1.quantity <--> TextField8.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP19SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP19Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP19Aligning = true;
			getTextField8().setText(getBol1().getQuantity());
			// user code begin {2}
			// user code end
			ivjConnPtoP19Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP19Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP1SetSource:  (PanelMainCard.layout <--> CardLayout1.this)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP1SetSource() {
	/* Set the source from the target */
	try {
		getPanelMainCard().setLayout(getCardLayout1());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP1SetTarget:  (PanelMainCard.layout <--> CardLayout1.this)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP1SetTarget() {
	/* Set the target from the source */
	try {
		setCardLayout1((java.awt.CardLayout)getPanelMainCard().getLayout());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP20SetSource:  (Bol1.gross_weight <--> TextField10.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP20SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP20Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP20Aligning = true;
			getBol1().setGross_weight(new java.lang.Double(getTextField10().getText()));
			// user code begin {2}
			// user code end
			ivjConnPtoP20Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP20Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP20SetTarget:  (Bol1.gross_weight <--> TextField10.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP20SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP20Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP20Aligning = true;
			getTextField10().setText(String.valueOf(getBol1().getGross_weight()));
			// user code begin {2}
			// user code end
			ivjConnPtoP20Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP20Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP21SetSource:  (Bol1.netweight <--> TextField12.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP21SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP21Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP21Aligning = true;
			getBol1().setNetweight(new java.lang.Double(getTextField12().getText()));
			// user code begin {2}
			// user code end
			ivjConnPtoP21Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP21Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP21SetTarget:  (Bol1.netweight <--> TextField12.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP21SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP21Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP21Aligning = true;
			getTextField12().setText(String.valueOf(getBol1().getNetweight()));
			// user code begin {2}
			// user code end
			ivjConnPtoP21Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP21Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP22SetSource:  (Bol1.marking <--> TextField14.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP22SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP22Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP22Aligning = true;
			getBol1().setMarking(getTextField14().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP22Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP22Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP22SetTarget:  (Bol1.marking <--> TextField14.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP22SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP22Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP22Aligning = true;
			getTextField14().setText(getBol1().getMarking());
			// user code begin {2}
			// user code end
			ivjConnPtoP22Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP22Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP23SetSource:  (Bol1.options <--> TextField16.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP23SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP23Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP23Aligning = true;
			getBol1().setOptions(getTextField16().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP23Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP23Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP23SetTarget:  (Bol1.options <--> TextField16.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP23SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP23Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP23Aligning = true;
			getTextField16().setText(getBol1().getOptions());
			// user code begin {2}
			// user code end
			ivjConnPtoP23Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP23Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP24SetSource:  (Bol1.bols <--> TextField18.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP24SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP24Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP24Aligning = true;
			getBol1().setBols(getTextField18().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP24Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP24Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP24SetTarget:  (Bol1.bols <--> TextField18.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP24SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP24Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP24Aligning = true;
			getTextField18().setText(getBol1().getBols());
			// user code begin {2}
			// user code end
			ivjConnPtoP24Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP24Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP25SetSource:  (Bol1.mnfstbot <--> TextField20.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP25SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP25Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP25Aligning = true;
			getBol1().setMnfstbot(getTextField20().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP25Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP25Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP25SetTarget:  (Bol1.mnfstbot <--> TextField20.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP25SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP25Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP25Aligning = true;
			getTextField20().setText(getBol1().getMnfstbot());
			// user code begin {2}
			// user code end
			ivjConnPtoP25Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP25Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP26SetSource:  (Bol1.descript <--> TextField22.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP26SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP26Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP26Aligning = true;
			getBol1().setDescript(getTextField22().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP26Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP26Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP26SetTarget:  (Bol1.descript <--> TextField22.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP26SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP26Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP26Aligning = true;
			getTextField22().setText(getBol1().getDescript());
			// user code begin {2}
			// user code end
			ivjConnPtoP26Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP26Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP27SetSource:  (Bol1.contract <--> TextField24.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP27SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP27Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP27Aligning = true;
			getBol1().setContract(getTextField24().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP27Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP27Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP27SetTarget:  (Bol1.contract <--> TextField24.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP27SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP27Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP27Aligning = true;
			getTextField24().setText(getBol1().getContract());
			// user code begin {2}
			// user code end
			ivjConnPtoP27Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP27Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP28SetSource:  (Bol1.note <--> TextField26.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP28SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP28Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP28Aligning = true;
			getBol1().setNote(getTextField26().getText());
			// user code begin {2}
			// user code end
			ivjConnPtoP28Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP28Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP28SetTarget:  (Bol1.note <--> TextField26.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP28SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP28Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP28Aligning = true;
			getTextField26().setText(getBol1().getNote());
			// user code begin {2}
			// user code end
			ivjConnPtoP28Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP28Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP29SetTarget:  (QueryshipperbolManager1.items <--> IList1.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP29SetTarget() {
	/* Set the target from the source */
	try {
		getIList1().setElements(getQueryshipperbolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP2SetTarget:  (BolManager1.items <--> BolResultForm1.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP2SetTarget() {
	/* Set the target from the source */
	try {
		getBolResultForm1().setElements(getBolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP3SetSource:  (Bol1.n <--> TextField1.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP3SetSource() {
	/* Set the source from the target */
	try {
		if (ivjConnPtoP3Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP3Aligning = true;
			getBol1().setN(new java.lang.Short(getTextField1().getText()));
			// user code begin {2}
			// user code end
			ivjConnPtoP3Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP3Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP3SetTarget:  (Bol1.n <--> TextField1.text)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP3SetTarget() {
	/* Set the target from the source */
	try {
		if (ivjConnPtoP3Aligning == false) {
			// user code begin {1}
			// user code end
			ivjConnPtoP3Aligning = true;
			getTextField1().setText(String.valueOf(getBol1().getN()));
			// user code begin {2}
			// user code end
			ivjConnPtoP3Aligning = false;
		}
	} catch (java.lang.Throwable ivjExc) {
		ivjConnPtoP3Aligning = false;
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP4SetTarget:  (QueryconsigneebolManager1.items <--> IList2.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP4SetTarget() {
	/* Set the target from the source */
	try {
		getIList2().setElements(getQueryconsigneebolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP5SetTarget:  (QuerynotyfyaddressbolManager1.items <--> IList3.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP5SetTarget() {
	/* Set the target from the source */
	try {
		getIList3().setElements(getQuerynotyfyaddressbolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP6SetTarget:  (QueryvesselbolManager11.items <--> IList31.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP6SetTarget() {
	/* Set the target from the source */
	try {
		getIList6().setElements(getQueryvesselbolManager11().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP7SetTarget:  (QueryshipownerbolManager1.items <--> IList4.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP7SetTarget() {
	/* Set the target from the source */
	try {
		getIList4().setElements(getQueryshipownerbolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP8SetTarget:  (QueryflagbolManager1.items <--> IList5.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP8SetTarget() {
	/* Set the target from the source */
	try {
		getIList5().setElements(getQueryflagbolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * connPtoP9SetTarget:  (QueryportofloadingbolManager1.items <--> IList7.elements)
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void connPtoP9SetTarget() {
	/* Set the target from the source */
	try {
		getIList7().setElements(getQueryportofloadingbolManager1().items());
		// user code begin {1}
		// user code end
	} catch (java.lang.Throwable ivjExc) {
		// user code begin {3}
		// user code end
		handleException(ivjExc);
	}
}
/**
 * Return the Bol1 property value.
 * @return uts.export.map.Bol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.Bol getBol1() {
	// user code begin {1}
	// user code end
	return ivjBol1;
}
/**
 * Return the BolDatastore1 property value.
 * @return uts.export.map.BolDatastore
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.BolDatastore getBolDatastore1() {
	if (ivjBolDatastore1 == null) {
		try {
			ivjBolDatastore1 = new uts.export.map.BolDatastore();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjBolDatastore1;
}
/**
 * Return the BolManager1 property value.
 * @return uts.export.map.BolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.BolManager getBolManager1() {
	if (ivjBolManager1 == null) {
		try {
			ivjBolManager1 = new uts.export.map.BolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjBolManager1;
}
/**
 * Return the BolResultForm1 property value.
 * @return uts.export.map.BolResultForm
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.BolResultForm getBolResultForm1() {
	if (ivjBolResultForm1 == null) {
		try {
			ivjBolResultForm1 = new uts.export.map.BolResultForm();
			ivjBolResultForm1.setName("BolResultForm1");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjBolResultForm1;
}
/**
 * Return the Button1 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton1() {
	if (ivjButton1 == null) {
		try {
			ivjButton1 = new java.awt.Button();
			ivjButton1.setName("Button1");
			ivjButton1.setLabel("\u0420\u0430\u0431\u043E\u0442\u0430 \u0441 \u0432\u044B\u0431\u0440\u043D\u043D\u043E\u0439 \u0441\u0442\u0440\u043E\u043A\u043E\u0439");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton1;
}
/**
 * Return the Button10 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton10() {
	if (ivjButton10 == null) {
		try {
			ivjButton10 = new java.awt.Button();
			ivjButton10.setName("Button10");
			ivjButton10.setLabel("\u0418\u041B\u0418");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton10;
}
/**
 * Return the Button111 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton111() {
	if (ivjButton111 == null) {
		try {
			ivjButton111 = new java.awt.Button();
			ivjButton111.setName("Button111");
			ivjButton111.setLabel("\u0423\u0414\u0410\u041B\u0418\u0422\u042C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton111;
}
/**
 * Return the Button12 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton12() {
	if (ivjButton12 == null) {
		try {
			ivjButton12 = new java.awt.Button();
			ivjButton12.setName("Button12");
			ivjButton12.setLabel("\u0418");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton12;
}
/**
 * Return the Button13 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton13() {
	if (ivjButton13 == null) {
		try {
			ivjButton13 = new java.awt.Button();
			ivjButton13.setName("Button13");
			ivjButton13.setLabel("\u041E\u0422\u041C\u0415\u041D\u0410");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton13;
}
/**
 * Return the Button14 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton14() {
	if (ivjButton14 == null) {
		try {
			ivjButton14 = new java.awt.Button();
			ivjButton14.setName("Button14");
			ivjButton14.setLabel("N \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton14;
}
/**
 * Return the Button15 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton15() {
	if (ivjButton15 == null) {
		try {
			ivjButton15 = new java.awt.Button();
			ivjButton15.setName("Button15");
			ivjButton15.setLabel("\u041F\u043E\u043B\u0443\u0447\u0430\u0442\u0435\u043B\u044E:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton15;
}
/**
 * Return the Button16 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton16() {
	if (ivjButton16 == null) {
		try {
			ivjButton16 = new java.awt.Button();
			ivjButton16.setName("Button16");
			ivjButton16.setLabel("\u041E\u0442\u043F\u0440\u0430\u0432\u0438\u0442\u0435\u043B\u044E:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton16;
}
/**
 * Return the Button17 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton17() {
	if (ivjButton17 == null) {
		try {
			ivjButton17 = new java.awt.Button();
			ivjButton17.setName("Button17");
			ivjButton17.setLabel("\u0422\u043E\u0432\u0430\u0440\u0443:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton17;
}
/**
 * Return the Button18 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton18() {
	if (ivjButton18 == null) {
		try {
			ivjButton18 = new java.awt.Button();
			ivjButton18.setName("Button18");
			ivjButton18.setLabel("\u0421\u0443\u0434\u043D\u0443:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton18;
}
/**
 * Return the Button19 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton19() {
	if (ivjButton19 == null) {
		try {
			ivjButton19 = new java.awt.Button();
			ivjButton19.setName("Button19");
			ivjButton19.setLabel("\u0414\u0430\u0442\u0435  \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton19;
}
/**
 * Return the Button191 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton191() {
	if (ivjButton191 == null) {
		try {
			ivjButton191 = new java.awt.Button();
			ivjButton191.setName("Button191");
			ivjButton191.setLabel("\u041E\u0422\u041C\u0415\u041D\u0410");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton191;
}
/**
 * Return the Button2 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton2() {
	if (ivjButton2 == null) {
		try {
			ivjButton2 = new java.awt.Button();
			ivjButton2.setName("Button2");
			ivjButton2.setLabel("\u041E\u041A\u041D\u041E \u0417\u0410\u041F\u0420\u041E\u0421\u0410");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton2;
}
/**
 * Return the Button21 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton21() {
	if (ivjButton21 == null) {
		try {
			ivjButton21 = new java.awt.Button();
			ivjButton21.setName("Button21");
			ivjButton21.setBounds(319, 48, 63, 23);
			ivjButton21.setLabel("OK");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton21;
}
/**
 * Return the Button211 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton211() {
	if (ivjButton211 == null) {
		try {
			ivjButton211 = new java.awt.Button();
			ivjButton211.setName("Button211");
			ivjButton211.setBounds(267, 18, 49, 23);
			ivjButton211.setLabel("OK");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton211;
}
/**
 * Return the Button3 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton3() {
	if (ivjButton3 == null) {
		try {
			ivjButton3 = new java.awt.Button();
			ivjButton3.setName("Button3");
			ivjButton3.setLabel("\u0420\u0435\u0437\u0443\u043B\u044C\u0442\u0438\u0440\u0443\u044E\u0449\u0438\u0439 \u0441\u043F\u0438\u0441\u043E\u043A");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton3;
}
/**
 * Return the Button4 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton4() {
	if (ivjButton4 == null) {
		try {
			ivjButton4 = new java.awt.Button();
			ivjButton4.setName("Button4");
			ivjButton4.setLabel("\u0414\u041E\u0411\u0410\u0412\u0418\u0422\u042C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton4;
}
/**
 * Return the Button5 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton5() {
	if (ivjButton5 == null) {
		try {
			ivjButton5 = new java.awt.Button();
			ivjButton5.setName("Button5");
			ivjButton5.setLabel("\u0418\u0421\u041F\u0420\u0410\u0412\u0418\u0422\u042C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton5;
}
/**
 * Return the Button6 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton6() {
	if (ivjButton6 == null) {
		try {
			ivjButton6 = new java.awt.Button();
			ivjButton6.setName("Button6");
			ivjButton6.setLabel("\u0423\u0414\u0410\u041B\u0418\u0422\u042C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton6;
}
/**
 * Return the Button7 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton7() {
	if (ivjButton7 == null) {
		try {
			ivjButton7 = new java.awt.Button();
			ivjButton7.setName("Button7");
			ivjButton7.setLabel("\u0418\u0417\u0412\u041B\u0415\u0427\u042C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton7;
}
/**
 * Return the Button8 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton8() {
	if (ivjButton8 == null) {
		try {
			ivjButton8 = new java.awt.Button();
			ivjButton8.setName("Button8");
			ivjButton8.setLabel("OK");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton8;
}
/**
 * Return the Button9 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getButton9() {
	if (ivjButton9 == null) {
		try {
			ivjButton9 = new java.awt.Button();
			ivjButton9.setName("Button9");
			ivjButton9.setLabel("\u0417\u0410\u041F\u0420\u041E\u0421");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjButton9;
}
/**
 * Return the CardLayout1 property value.
 * @return java.awt.CardLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.CardLayout getCardLayout1() {
	// user code begin {1}
	// user code end
	return ivjCardLayout1;
}
/**
 * Return the CardLayout2 property value.
 * @return java.awt.CardLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.CardLayout getCardLayout2() {
	// user code begin {1}
	// user code end
	return ivjCardLayout2;
}
/**
 * Return the ContentsPane property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getContentsPane() {
	if (ivjContentsPane == null) {
		try {
			ivjContentsPane = new java.awt.Panel();
			ivjContentsPane.setName("ContentsPane");
			ivjContentsPane.setLayout(new java.awt.BorderLayout());
			getContentsPane().add(getPanelMainCard(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjContentsPane;
}
/**
 * Return the ContentsPane1 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getContentsPane1() {
	if (ivjContentsPane1 == null) {
		try {
			ivjContentsPane1 = new java.awt.Panel();
			ivjContentsPane1.setName("ContentsPane1");
			ivjContentsPane1.setLayout(new java.awt.BorderLayout());
			getContentsPane1().add(getPanel11(), "Center");
			getContentsPane1().add(getPanel21(), "South");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjContentsPane1;
}
/**
 * Return the ContentsPane11 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getContentsPane11() {
	if (ivjContentsPane11 == null) {
		try {
			ivjContentsPane11 = new java.awt.Panel();
			ivjContentsPane11.setName("ContentsPane11");
			ivjContentsPane11.setLayout(new java.awt.BorderLayout());
			getContentsPane11().add(getPaneCard(), "Center");
			getContentsPane11().add(getPanelSouth(), "South");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjContentsPane11;
}
/**
 * Return the ContentsPane2 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getContentsPane2() {
	if (ivjContentsPane2 == null) {
		try {
			ivjContentsPane2 = new java.awt.Panel();
			ivjContentsPane2.setName("ContentsPane2");
			ivjContentsPane2.setLayout(new java.awt.BorderLayout());
			getContentsPane2().add(getPanel3(), "South");
			getContentsPane2().add(getPanel4(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjContentsPane2;
}
/**
 * Return the Dialog1 property value.
 * @return java.awt.Dialog
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Dialog getDialog1() {
	if (ivjDialog1 == null) {
		try {
			ivjDialog1 = new java.awt.Dialog(this);
			ivjDialog1.setName("Dialog1");
			ivjDialog1.setLayout(new java.awt.BorderLayout());
			ivjDialog1.setBounds(182, 449, 187, 117);
			ivjDialog1.setTitle("\u0414\u0430\u0442\u0430 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430.");
			getDialog1().add(getContentsPane1(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjDialog1;
}
/**
 * Return the Dialog11 property value.
 * @return java.awt.Dialog
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Dialog getDialog11() {
	if (ivjDialog11 == null) {
		try {
			ivjDialog11 = new java.awt.Dialog(this);
			ivjDialog11.setName("Dialog11");
			ivjDialog11.setLayout(new java.awt.BorderLayout());
			ivjDialog11.setBounds(401, 458, 189, 89);
			ivjDialog11.setModal(true);
			ivjDialog11.setTitle("\u0412\u041D\u0418\u041C\u0410\u041D\u0418\u0415:");
			getDialog11().add(getContentsPane2(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjDialog11;
}
/**
 * Return the DialogQuery property value.
 * @return java.awt.Dialog
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Dialog getDialogQuery() {
	if (ivjDialogQuery == null) {
		try {
			ivjDialogQuery = new java.awt.Dialog(this);
			ivjDialogQuery.setName("DialogQuery");
			ivjDialogQuery.setLayout(new java.awt.BorderLayout());
			ivjDialogQuery.setBounds(75, 611, 393, 253);
			ivjDialogQuery.setVisible(false);
			ivjDialogQuery.setTitle("\u0417\u0430\u043F\u0440\u043E\u0441 \u043F\u043E :");
			getDialogQuery().add(getContentsPane11(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjDialogQuery;
}
/**
 * Return the IList1 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList1() {
	if (ivjIList1 == null) {
		try {
			ivjIList1 = new com.ibm.ivj.eab.dab.IList();
			ivjIList1.setName("IList1");
			ivjIList1.setBounds(811, 6, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList1;
}
/**
 * Return the IList2 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList2() {
	if (ivjIList2 == null) {
		try {
			ivjIList2 = new com.ibm.ivj.eab.dab.IList();
			ivjIList2.setName("IList2");
			ivjIList2.setBounds(810, 53, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList2;
}
/**
 * Return the IList3 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList3() {
	if (ivjIList3 == null) {
		try {
			ivjIList3 = new com.ibm.ivj.eab.dab.IList();
			ivjIList3.setName("IList3");
			ivjIList3.setBounds(810, 101, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList3;
}
/**
 * Return the IList4 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList4() {
	if (ivjIList4 == null) {
		try {
			ivjIList4 = new com.ibm.ivj.eab.dab.IList();
			ivjIList4.setName("IList4");
			ivjIList4.setBounds(811, 150, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList4;
}
/**
 * Return the IList5 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList5() {
	if (ivjIList5 == null) {
		try {
			ivjIList5 = new com.ibm.ivj.eab.dab.IList();
			ivjIList5.setName("IList5");
			ivjIList5.setBounds(811, 197, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList5;
}
/**
 * Return the IList51 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList51() {
	if (ivjIList51 == null) {
		try {
			ivjIList51 = new com.ibm.ivj.eab.dab.IList();
			ivjIList51.setName("IList51");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList51;
}
/**
 * Return the IList31 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList6() {
	if (ivjIList6 == null) {
		try {
			ivjIList6 = new com.ibm.ivj.eab.dab.IList();
			ivjIList6.setName("IList6");
			ivjIList6.setBounds(811, 243, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList6;
}
/**
 * Return the IList7 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList7() {
	if (ivjIList7 == null) {
		try {
			ivjIList7 = new com.ibm.ivj.eab.dab.IList();
			ivjIList7.setName("IList7");
			ivjIList7.setBounds(810, 287, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList7;
}
/**
 * Return the IList8 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList8() {
	if (ivjIList8 == null) {
		try {
			ivjIList8 = new com.ibm.ivj.eab.dab.IList();
			ivjIList8.setName("IList8");
			ivjIList8.setBounds(811, 338, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList8;
}
/**
 * Return the IList9 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList9() {
	if (ivjIList9 == null) {
		try {
			ivjIList9 = new com.ibm.ivj.eab.dab.IList();
			ivjIList9.setName("IList9");
			ivjIList9.setBounds(810, 392, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList9;
}
/**
 * Return the IList91 property value.
 * @return com.ibm.ivj.eab.dab.IList
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IList getIList91() {
	if (ivjIList91 == null) {
		try {
			ivjIList91 = new com.ibm.ivj.eab.dab.IList();
			ivjIList91.setName("IList91");
			ivjIList91.setBounds(809, 442, 45, 47);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIList91;
}
/**
 * Return the IMessageBox1 property value.
 * @return com.ibm.ivj.eab.dab.IMessageBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.ivj.eab.dab.IMessageBox getIMessageBox1() {
	if (ivjIMessageBox1 == null) {
		try {
			ivjIMessageBox1 = new com.ibm.ivj.eab.dab.IMessageBox();
			ivjIMessageBox1.setName("IMessageBox1");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjIMessageBox1;
}
/**
 * Return the Label1 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel1() {
	if (ivjLabel1 == null) {
		try {
			ivjLabel1 = new java.awt.Label();
			ivjLabel1.setName("Label1");
			ivjLabel1.setText("N \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel1;
}
/**
 * Return the Label10 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel10() {
	if (ivjLabel10 == null) {
		try {
			ivjLabel10 = new java.awt.Label();
			ivjLabel10.setName("Label10");
			ivjLabel10.setText("\u041C\u0430\u0441\u0441\u0430 \u0431\u0440\u0443\u0442\u0442\u043E");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel10;
}
/**
 * Return the Label11 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel11() {
	if (ivjLabel11 == null) {
		try {
			ivjLabel11 = new java.awt.Button();
			ivjLabel11.setName("Label11");
			ivjLabel11.setLabel("\u0424\u043B\u0430\u0433");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel11;
}
/**
 * Return the Label111 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel111() {
	if (ivjLabel111 == null) {
		try {
			ivjLabel111 = new java.awt.Label();
			ivjLabel111.setName("Label111");
			ivjLabel111.setAlignment(java.awt.Label.CENTER);
			ivjLabel111.setText("\u043C\u0435\u0441\u044F\u0446:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel111;
}
/**
 * Return the Label12 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel12() {
	if (ivjLabel12 == null) {
		try {
			ivjLabel12 = new java.awt.Label();
			ivjLabel12.setName("Label12");
			ivjLabel12.setText("\u041C\u0430\u0441\u0441\u0430 \u043D\u0435\u0442\u0442\u043E");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel12;
}
/**
 * Return the Label121 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel121() {
	if (ivjLabel121 == null) {
		try {
			ivjLabel121 = new java.awt.Label();
			ivjLabel121.setName("Label121");
			ivjLabel121.setText("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0432 \u0442\u0435\u043A\u0441\u0442\u043E\u0432\u043E\u0435 \u043F\u043E\u043B\u0435 \u043D\u043E\u043C\u0435\u0440\u0430 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u043E\u0432 \u0447\u0435\u0440\u0435\u0437 \u0437\u0430\u043F\u044F\u0442\u0443\u044E");
			ivjLabel121.setBounds(14, 13, 358, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel121;
}
/**
 * Return the Label13 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel13() {
	if (ivjLabel13 == null) {
		try {
			ivjLabel13 = new java.awt.Button();
			ivjLabel13.setName("Label13");
			ivjLabel13.setLabel("\u0421\u0443\u0434\u043D\u043E");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel13;
}
/**
 * Return the Label14 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel14() {
	if (ivjLabel14 == null) {
		try {
			ivjLabel14 = new java.awt.Label();
			ivjLabel14.setName("Label14");
			ivjLabel14.setText("\u041C\u0430\u0440\u043A\u0438\u0440\u043E\u0432\u043A\u0430");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel14;
}
/**
 * Return the Label141 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel141() {
	if (ivjLabel141 == null) {
		try {
			ivjLabel141 = new java.awt.Label();
			ivjLabel141.setName("Label141");
			ivjLabel141.setText("\u0414\u0430\u0442\u0435 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438:");
			ivjLabel141.setBounds(32, 15, 182, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel141;
}
/**
 * Return the Label15 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel15() {
	if (ivjLabel15 == null) {
		try {
			ivjLabel15 = new java.awt.Button();
			ivjLabel15.setName("Label15");
			ivjLabel15.setLabel("\u041F\u043E\u0440\u0442 \u043F\u043E\u0433\u0440\u0443\u0437\u043A\u0438");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel15;
}
/**
 * Return the Label151 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel151() {
	if (ivjLabel151 == null) {
		try {
			ivjLabel151 = new java.awt.Label();
			ivjLabel151.setName("Label151");
			ivjLabel151.setAlignment(java.awt.Label.CENTER);
			ivjLabel151.setText("\u0447\u0438\u0441\u043B\u043E");
			ivjLabel151.setBounds(87, 42, 52, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel151;
}
/**
 * Return the Label16 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel16() {
	if (ivjLabel16 == null) {
		try {
			ivjLabel16 = new java.awt.Label();
			ivjLabel16.setName("Label16");
			ivjLabel16.setText("\u0414\u043E\u043F. \u0443\u043A\u0430\u0437\u0430\u043D\u0438\u044F");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel16;
}
/**
 * Return the Label161 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel161() {
	if (ivjLabel161 == null) {
		try {
			ivjLabel161 = new java.awt.Label();
			ivjLabel161.setName("Label161");
			ivjLabel161.setAlignment(java.awt.Label.CENTER);
			ivjLabel161.setText("\u043C\u0435\u0441\u044F\u0446");
			ivjLabel161.setBounds(154, 42, 54, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel161;
}
/**
 * Return the Label17 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel17() {
	if (ivjLabel17 == null) {
		try {
			ivjLabel17 = new java.awt.Button();
			ivjLabel17.setName("Label17");
			ivjLabel17.setLabel("\u041F\u043E\u0440\u0442 \u0432\u044B\u0433\u0440\u0443\u0437\u043A\u0438");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel17;
}
/**
 * Return the Label171 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel171() {
	if (ivjLabel171 == null) {
		try {
			ivjLabel171 = new java.awt.Label();
			ivjLabel171.setName("Label171");
			ivjLabel171.setAlignment(java.awt.Label.CENTER);
			ivjLabel171.setText("\u0433\u043E\u0434");
			ivjLabel171.setBounds(214, 42, 59, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel171;
}
/**
 * Return the Label18 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel18() {
	if (ivjLabel18 == null) {
		try {
			ivjLabel18 = new java.awt.Label();
			ivjLabel18.setName("Label18");
			ivjLabel18.setText("\u0421\u043F\u0438\u0441\u043E\u043A \u043A\u043E\u043D\u043E\u0441\u0430\u043C\u0435\u043D\u0442\u043E\u0432");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel18;
}
/**
 * Return the Label19 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel19() {
	if (ivjLabel19 == null) {
		try {
			ivjLabel19 = new java.awt.Button();
			ivjLabel19.setName("Label19");
			ivjLabel19.setLabel("\u041F\u0443\u043D\u043A\u0442 \u043D\u0430\u0437\u043D\u0447\u0435\u043D\u0438\u044F");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel19;
}
/**
 * Return the Label191 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel191() {
	if (ivjLabel191 == null) {
		try {
			ivjLabel191 = new java.awt.Label();
			ivjLabel191.setName("Label191");
			ivjLabel191.setAlignment(java.awt.Label.RIGHT);
			ivjLabel191.setText("\u041F\u041E");
			ivjLabel191.setBounds(56, 113, 30, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel191;
}
/**
 * Return the Label192 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel192() {
	if (ivjLabel192 == null) {
		try {
			ivjLabel192 = new java.awt.Label();
			ivjLabel192.setName("Label192");
			ivjLabel192.setAlignment(java.awt.Label.RIGHT);
			ivjLabel192.setText("\u0421");
			ivjLabel192.setBounds(55, 72, 30, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel192;
}
/**
 * Return the Label2 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel2() {
	if (ivjLabel2 == null) {
		try {
			ivjLabel2 = new java.awt.Label();
			ivjLabel2.setName("Label2");
			ivjLabel2.setText("\u0418\u043C\u044F \u0442\u043E\u0432\u0430\u0440\u0430");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel2;
}
/**
 * Return the Label20 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel20() {
	if (ivjLabel20 == null) {
		try {
			ivjLabel20 = new java.awt.Label();
			ivjLabel20.setName("Label20");
			ivjLabel20.setText("\u041F\u0440\u0438\u043C. \u043C\u0430\u043D\u0438\u0444\u0435\u0441\u0442\u0430");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel20;
}
/**
 * Return the Label201 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel201() {
	if (ivjLabel201 == null) {
		try {
			ivjLabel201 = new java.awt.Label();
			ivjLabel201.setName("Label201");
			ivjLabel201.setFont(new java.awt.Font("dialog", 1, 12));
			ivjLabel201.setAlignment(java.awt.Label.CENTER);
			ivjLabel201.setText("\u041F\u041E\u0414\u0422\u0412\u0415\u0420\u0422\u0418\u0422\u0415  \u0423\u0414\u0410\u041B\u0415\u041D\u0418\u0415");
			ivjLabel201.setBackground(java.awt.Color.red);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel201;
}
/**
 * Return the Label21 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel21() {
	if (ivjLabel21 == null) {
		try {
			ivjLabel21 = new java.awt.Button();
			ivjLabel21.setName("Label21");
			ivjLabel21.setLabel("\u0424\u0440\u0430\u0445\u0442");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel21;
}
/**
 * Return the Label22 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel22() {
	if (ivjLabel22 == null) {
		try {
			ivjLabel22 = new java.awt.Label();
			ivjLabel22.setName("Label22");
			ivjLabel22.setText("\u041E\u043F\u0438\u0441\u0430\u043D\u0438\u0435");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel22;
}
/**
 * Return the Label23 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel23() {
	if (ivjLabel23 == null) {
		try {
			ivjLabel23 = new java.awt.Button();
			ivjLabel23.setName("Label23");
			ivjLabel23.setLabel("\u0414\u0430\u0442\u0430 \u0434\u043E\u043A\u0443\u043C\u0435\u043D\u0442\u0430");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel23;
}
/**
 * Return the Label24 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel24() {
	if (ivjLabel24 == null) {
		try {
			ivjLabel24 = new java.awt.Label();
			ivjLabel24.setName("Label24");
			ivjLabel24.setText("\u041A\u043E\u043D\u0442\u0440\u0430\u043A\u0442");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel24;
}
/**
 * Return the Label25 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel25() {
	if (ivjLabel25 == null) {
		try {
			ivjLabel25 = new java.awt.Label();
			ivjLabel25.setName("Label25");
			ivjLabel25.setText("\u041A\u0430\u043F\u0438\u0442\u0430\u043D");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel25;
}
/**
 * Return the Label26 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel26() {
	if (ivjLabel26 == null) {
		try {
			ivjLabel26 = new java.awt.Label();
			ivjLabel26.setName("Label26");
			ivjLabel26.setText("\u041F\u0440\u0438\u043C\u0435\u0447\u0430\u043D\u0438\u0435");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel26;
}
/**
 * Return the Label3 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel3() {
	if (ivjLabel3 == null) {
		try {
			ivjLabel3 = new java.awt.Button();
			ivjLabel3.setName("Label3");
			ivjLabel3.setLabel("\u041E\u0442\u043F\u0440\u0430\u0432\u0438\u0442\u0435\u043B\u044C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel3;
}
/**
 * Return the Label31 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel31() {
	if (ivjLabel31 == null) {
		try {
			ivjLabel31 = new java.awt.Label();
			ivjLabel31.setName("Label31");
			ivjLabel31.setAlignment(java.awt.Label.CENTER);
			ivjLabel31.setText("\u0433\u043E\u0434:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel31;
}
/**
 * Return the Label4 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel4() {
	if (ivjLabel4 == null) {
		try {
			ivjLabel4 = new java.awt.Label();
			ivjLabel4.setName("Label4");
			ivjLabel4.setText("\u0420\u0443\u0441. \u0438\u043C\u044F \u0442\u043E\u0432\u0430\u0440\u0430");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel4;
}
/**
 * Return the Label5 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel5() {
	if (ivjLabel5 == null) {
		try {
			ivjLabel5 = new java.awt.Button();
			ivjLabel5.setName("Label5");
			ivjLabel5.setLabel("\u041F\u043E\u043B\u0443\u0447\u0430\u0442\u0435\u043B\u044C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel5;
}
/**
 * Return the Label6 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel6() {
	if (ivjLabel6 == null) {
		try {
			ivjLabel6 = new java.awt.Label();
			ivjLabel6.setName("Label6");
			ivjLabel6.setText("\u0415\u0434.\u0438\u0437\u043C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel6;
}
/**
 * Return the Label61 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel61() {
	if (ivjLabel61 == null) {
		try {
			ivjLabel61 = new java.awt.Label();
			ivjLabel61.setName("Label61");
			ivjLabel61.setAlignment(java.awt.Label.CENTER);
			ivjLabel61.setText("\u0447\u0438\u0441\u043B\u043E:");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel61;
}
/**
 * Return the Label7 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel7() {
	if (ivjLabel7 == null) {
		try {
			ivjLabel7 = new java.awt.Button();
			ivjLabel7.setName("Label7");
			ivjLabel7.setLabel("\u0418\u0437\u0432\u0435\u0449\u0430\u0442\u044C");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel7;
}
/**
 * Return the Label8 property value.
 * @return java.awt.Label
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Label getLabel8() {
	if (ivjLabel8 == null) {
		try {
			ivjLabel8 = new java.awt.Label();
			ivjLabel8.setName("Label8");
			ivjLabel8.setText("\u0427\u0438\u0441\u043B\u043E \u043C\u0435\u0441\u0442");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel8;
}
/**
 * Return the Label9 property value.
 * @return java.awt.Button
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Button getLabel9() {
	if (ivjLabel9 == null) {
		try {
			ivjLabel9 = new java.awt.Button();
			ivjLabel9.setName("Label9");
			ivjLabel9.setLabel("\u0421\u0443\u0434\u043E\u0432\u043B\u0430\u0434\u0435\u043B\u0435\u0446");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjLabel9;
}
/**
 * Return the PaneButton property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPaneButton() {
	if (ivjPaneButton == null) {
		try {
			ivjPaneButton = new java.awt.Panel();
			ivjPaneButton.setName("PaneButton");
			ivjPaneButton.setLayout(new java.awt.GridLayout());
			getPaneButton().add(getButton9(), getButton9().getName());
			getPaneButton().add(getButton10(), getButton10().getName());
			getPaneButton().add(getButton12(), getButton12().getName());
			getPaneButton().add(getButton13(), getButton13().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPaneButton;
}
/**
 * Return the PaneCard property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPaneCard() {
	if (ivjPaneCard == null) {
		try {
			ivjPaneCard = new java.awt.Panel();
			ivjPaneCard.setName("PaneCard");
			ivjPaneCard.setLayout(new java.awt.CardLayout());
			getPaneCard().add(getPanelViewer(), getPanelViewer().getName());
			getPaneCard().add(getPanelFerst(), getPanelFerst().getName());
			getPaneCard().add(getPanelDate(), getPanelDate().getName());
			getPaneCard().add(getIList51(), getIList51().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPaneCard;
}
/**
 * Return the Panel1 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanel1() {
	if (ivjPanel1 == null) {
		try {
			ivjPanel1 = new java.awt.Panel();
			ivjPanel1.setName("Panel1");
			ivjPanel1.setLayout(getPanel1GridLayout());
			ivjPanel1.setBackground(java.awt.Color.black);
			getPanel1().add(getButton4(), getButton4().getName());
			getPanel1().add(getButton6(), getButton6().getName());
			getPanel1().add(getButton7(), getButton7().getName());
			getPanel1().add(getButton5(), getButton5().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanel1;
}
/**
 * Return the Panel11 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanel11() {
	if (ivjPanel11 == null) {
		try {
			ivjPanel11 = new java.awt.Panel();
			ivjPanel11.setName("Panel11");
			ivjPanel11.setLayout(getPanel11GridLayout());
			getPanel11().add(getLabel61(), getLabel61().getName());
			getPanel11().add(getTextField171(), getTextField171().getName());
			getPanel11().add(getLabel111(), getLabel111().getName());
			getPanel11().add(getTextField191(), getTextField191().getName());
			getPanel11().add(getLabel31(), getLabel31().getName());
			getPanel11().add(getTextField181(), getTextField181().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanel11;
}
/**
 * Return the Panel11GridLayout property value.
 * @return java.awt.GridLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.GridLayout getPanel11GridLayout() {
	java.awt.GridLayout ivjPanel11GridLayout = null;
	try {
		/* Create part */
		ivjPanel11GridLayout = new java.awt.GridLayout(3, 2);
		ivjPanel11GridLayout.setVgap(2);
		ivjPanel11GridLayout.setHgap(2);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjPanel11GridLayout;
}
/**
 * Return the Panel1GridLayout property value.
 * @return java.awt.GridLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.GridLayout getPanel1GridLayout() {
	java.awt.GridLayout ivjPanel1GridLayout = null;
	try {
		/* Create part */
		ivjPanel1GridLayout = new java.awt.GridLayout();
		ivjPanel1GridLayout.setVgap(2);
		ivjPanel1GridLayout.setHgap(3);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjPanel1GridLayout;
}
/**
 * Return the Panel2 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanel2() {
	if (ivjPanel2 == null) {
		try {
			ivjPanel2 = new java.awt.Panel();
			ivjPanel2.setName("Panel2");
			ivjPanel2.setLayout(getPanel2GridLayout());
			getPanel2().add(getLabel1(), getLabel1().getName());
			getPanel2().add(getTextField1(), getTextField1().getName());
			getPanel2().add(getLabel2(), getLabel2().getName());
			getPanel2().add(getTextField2(), getTextField2().getName());
			getPanel2().add(getLabel3(), getLabel3().getName());
			getPanel2().add(getTextField3(), getTextField3().getName());
			getPanel2().add(getLabel4(), getLabel4().getName());
			getPanel2().add(getTextField4(), getTextField4().getName());
			getPanel2().add(getLabel5(), getLabel5().getName());
			getPanel2().add(getTextField5(), getTextField5().getName());
			getPanel2().add(getLabel6(), getLabel6().getName());
			getPanel2().add(getTextField6(), getTextField6().getName());
			getPanel2().add(getLabel7(), getLabel7().getName());
			getPanel2().add(getTextField7(), getTextField7().getName());
			getPanel2().add(getLabel8(), getLabel8().getName());
			getPanel2().add(getTextField8(), getTextField8().getName());
			getPanel2().add(getLabel9(), getLabel9().getName());
			getPanel2().add(getTextField9(), getTextField9().getName());
			getPanel2().add(getLabel10(), getLabel10().getName());
			getPanel2().add(getTextField10(), getTextField10().getName());
			getPanel2().add(getLabel11(), getLabel11().getName());
			getPanel2().add(getTextField11(), getTextField11().getName());
			getPanel2().add(getLabel12(), getLabel12().getName());
			getPanel2().add(getTextField12(), getTextField12().getName());
			getPanel2().add(getLabel13(), getLabel13().getName());
			getPanel2().add(getTextField13(), getTextField13().getName());
			getPanel2().add(getLabel14(), getLabel14().getName());
			getPanel2().add(getTextField14(), getTextField14().getName());
			getPanel2().add(getLabel15(), getLabel15().getName());
			getPanel2().add(getTextField15(), getTextField15().getName());
			getPanel2().add(getLabel16(), getLabel16().getName());
			getPanel2().add(getTextField16(), getTextField16().getName());
			getPanel2().add(getLabel17(), getLabel17().getName());
			getPanel2().add(getTextField17(), getTextField17().getName());
			getPanel2().add(getLabel18(), getLabel18().getName());
			getPanel2().add(getTextField18(), getTextField18().getName());
			getPanel2().add(getLabel19(), getLabel19().getName());
			getPanel2().add(getTextField19(), getTextField19().getName());
			getPanel2().add(getLabel20(), getLabel20().getName());
			getPanel2().add(getTextField20(), getTextField20().getName());
			getPanel2().add(getLabel21(), getLabel21().getName());
			getPanel2().add(getTextField21(), getTextField21().getName());
			getPanel2().add(getLabel22(), getLabel22().getName());
			getPanel2().add(getTextField22(), getTextField22().getName());
			getPanel2().add(getLabel23(), getLabel23().getName());
			getPanel2().add(getTextField23(), getTextField23().getName());
			getPanel2().add(getLabel24(), getLabel24().getName());
			getPanel2().add(getTextField24(), getTextField24().getName());
			getPanel2().add(getLabel25(), getLabel25().getName());
			getPanel2().add(getTextField25(), getTextField25().getName());
			getPanel2().add(getLabel26(), getLabel26().getName());
			getPanel2().add(getTextField26(), getTextField26().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanel2;
}
/**
 * Return the Panel21 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanel21() {
	if (ivjPanel21 == null) {
		try {
			ivjPanel21 = new java.awt.Panel();
			ivjPanel21.setName("Panel21");
			ivjPanel21.setLayout(new java.awt.FlowLayout());
			getPanel21().add(getButton8(), getButton8().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanel21;
}
/**
 * Return the Panel2GridLayout property value.
 * @return java.awt.GridLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.GridLayout getPanel2GridLayout() {
	java.awt.GridLayout ivjPanel2GridLayout = null;
	try {
		/* Create part */
		ivjPanel2GridLayout = new java.awt.GridLayout(13, 4);
		ivjPanel2GridLayout.setVgap(2);
		ivjPanel2GridLayout.setHgap(2);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjPanel2GridLayout;
}
/**
 * Return the Panel3 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanel3() {
	if (ivjPanel3 == null) {
		try {
			ivjPanel3 = new java.awt.Panel();
			ivjPanel3.setName("Panel3");
			ivjPanel3.setLayout(getPanel3GridLayout());
			getPanel3().add(getButton111(), getButton111().getName());
			getPanel3().add(getButton191(), getButton191().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanel3;
}
/**
 * Return the Panel3GridLayout property value.
 * @return java.awt.GridLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.GridLayout getPanel3GridLayout() {
	java.awt.GridLayout ivjPanel3GridLayout = null;
	try {
		/* Create part */
		ivjPanel3GridLayout = new java.awt.GridLayout();
		ivjPanel3GridLayout.setHgap(10);
		ivjPanel3GridLayout.setColumns(2);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjPanel3GridLayout;
}
/**
 * Return the Panel4 property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanel4() {
	if (ivjPanel4 == null) {
		try {
			ivjPanel4 = new java.awt.Panel();
			ivjPanel4.setName("Panel4");
			ivjPanel4.setLayout(new java.awt.FlowLayout());
			getPanel4().add(getLabel201(), getLabel201().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanel4;
}
/**
 * Return the PanelA property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanelA() {
	if (ivjPanelA == null) {
		try {
			ivjPanelA = new java.awt.Panel();
			ivjPanelA.setName("PanelA");
			ivjPanelA.setLayout(new java.awt.BorderLayout());
			getPanelA().add(getButton1(), "North");
			getPanelA().add(getButton2(), "South");
			getPanelA().add(getBolResultForm1(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanelA;
}
/**
 * Return the PanelB property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanelB() {
	if (ivjPanelB == null) {
		try {
			ivjPanelB = new java.awt.Panel();
			ivjPanelB.setName("PanelB");
			ivjPanelB.setLayout(new java.awt.BorderLayout());
			getPanelB().add(getButton3(), "North");
			getPanelB().add(getPanel1(), "South");
			getPanelB().add(getPanel2(), "Center");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanelB;
}
/**
 * Return the PanelDate property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanelDate() {
	if (ivjPanelDate == null) {
		try {
			ivjPanelDate = new java.awt.Panel();
			ivjPanelDate.setName("PanelDate");
			ivjPanelDate.setLayout(null);
			getPanelDate().add(getLabel141(), getLabel141().getName());
			getPanelDate().add(getButton211(), getButton211().getName());
			getPanelDate().add(getTextField14111(), getTextField14111().getName());
			getPanelDate().add(getTextField1412(), getTextField1412().getName());
			getPanelDate().add(getTextField142(), getTextField142().getName());
			getPanelDate().add(getLabel151(), getLabel151().getName());
			getPanelDate().add(getLabel161(), getLabel161().getName());
			getPanelDate().add(getLabel171(), getLabel171().getName());
			getPanelDate().add(getTextField1411(), getTextField1411().getName());
			getPanelDate().add(getTextField141(), getTextField141().getName());
			getPanelDate().add(getTextField143(), getTextField143().getName());
			getPanelDate().add(getLabel191(), getLabel191().getName());
			getPanelDate().add(getLabel192(), getLabel192().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanelDate;
}
/**
 * Return the PanelFerst property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanelFerst() {
	if (ivjPanelFerst == null) {
		try {
			ivjPanelFerst = new java.awt.Panel();
			ivjPanelFerst.setName("PanelFerst");
			ivjPanelFerst.setLayout(null);
			getPanelFerst().add(getLabel121(), getLabel121().getName());
			getPanelFerst().add(getTextField201(), getTextField201().getName());
			getPanelFerst().add(getButton21(), getButton21().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanelFerst;
}
/**
 * Return the PanelMainCard property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanelMainCard() {
	if (ivjPanelMainCard == null) {
		try {
			ivjPanelMainCard = new java.awt.Panel();
			ivjPanelMainCard.setName("PanelMainCard");
			ivjPanelMainCard.setLayout(new java.awt.CardLayout());
			getPanelMainCard().add(getPanelA(), getPanelA().getName());
			getPanelMainCard().add(getPanelB(), getPanelB().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanelMainCard;
}
/**
 * Return the PanelSouth property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanelSouth() {
	if (ivjPanelSouth == null) {
		try {
			ivjPanelSouth = new java.awt.Panel();
			ivjPanelSouth.setName("PanelSouth");
			ivjPanelSouth.setLayout(getPanelSouthBorderLayout());
			getPanelSouth().add(getTextArea1(), "North");
			getPanelSouth().add(getPaneButton(), "South");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanelSouth;
}
/**
 * Return the PanelSouthBorderLayout property value.
 * @return java.awt.BorderLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.BorderLayout getPanelSouthBorderLayout() {
	java.awt.BorderLayout ivjPanelSouthBorderLayout = null;
	try {
		/* Create part */
		ivjPanelSouthBorderLayout = new java.awt.BorderLayout();
		ivjPanelSouthBorderLayout.setVgap(2);
		ivjPanelSouthBorderLayout.setHgap(2);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjPanelSouthBorderLayout;
}
/**
 * Return the PanelViewer property value.
 * @return java.awt.Panel
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.Panel getPanelViewer() {
	if (ivjPanelViewer == null) {
		try {
			ivjPanelViewer = new java.awt.Panel();
			ivjPanelViewer.setName("PanelViewer");
			ivjPanelViewer.setLayout(getPanelViewerGridLayout());
			ivjPanelViewer.setVisible(true);
			getPanelViewer().add(getButton14(), getButton14().getName());
			getPanelViewer().add(getButton16(), getButton16().getName());
			getPanelViewer().add(getButton15(), getButton15().getName());
			getPanelViewer().add(getButton18(), getButton18().getName());
			getPanelViewer().add(getButton17(), getButton17().getName());
			getPanelViewer().add(getButton19(), getButton19().getName());
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjPanelViewer;
}
/**
 * Return the PanelViewerGridLayout property value.
 * @return java.awt.GridLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.GridLayout getPanelViewerGridLayout() {
	java.awt.GridLayout ivjPanelViewerGridLayout = null;
	try {
		/* Create part */
		ivjPanelViewerGridLayout = new java.awt.GridLayout(6, 0);
		ivjPanelViewerGridLayout.setVgap(0);
		ivjPanelViewerGridLayout.setHgap(1);
	} catch (java.lang.Throwable ivjExc) {
		handleException(ivjExc);
	};
	return ivjPanelViewerGridLayout;
}
/**
 * Return the QueryconsigneebolManager1 property value.
 * @return uts.export.map.QueryconsigneebolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QueryconsigneebolManager getQueryconsigneebolManager1() {
	if (ivjQueryconsigneebolManager1 == null) {
		try {
			ivjQueryconsigneebolManager1 = new uts.export.map.QueryconsigneebolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQueryconsigneebolManager1;
}
/**
 * Return the QuerydistinationbolManager1 property value.
 * @return uts.export.map.QuerydistinationbolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QuerydistinationbolManager getQuerydistinationbolManager1() {
	if (ivjQuerydistinationbolManager1 == null) {
		try {
			ivjQuerydistinationbolManager1 = new uts.export.map.QuerydistinationbolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQuerydistinationbolManager1;
}
/**
 * Return the QueryflagbolManager1 property value.
 * @return uts.export.map.QueryflagbolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QueryflagbolManager getQueryflagbolManager1() {
	if (ivjQueryflagbolManager1 == null) {
		try {
			ivjQueryflagbolManager1 = new uts.export.map.QueryflagbolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQueryflagbolManager1;
}
/**
 * Return the QueryfreightbolManager1 property value.
 * @return uts.export.map.QueryfreightbolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QueryfreightbolManager getQueryfreightbolManager1() {
	if (ivjQueryfreightbolManager1 == null) {
		try {
			ivjQueryfreightbolManager1 = new uts.export.map.QueryfreightbolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQueryfreightbolManager1;
}
/**
 * Return the QuerynotyfyaddressbolManager1 property value.
 * @return uts.export.map.QuerynotyfyaddressbolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QuerynotyfyaddressbolManager getQuerynotyfyaddressbolManager1() {
	if (ivjQuerynotyfyaddressbolManager1 == null) {
		try {
			ivjQuerynotyfyaddressbolManager1 = new uts.export.map.QuerynotyfyaddressbolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQuerynotyfyaddressbolManager1;
}
/**
 * Return the QueryportofdischargebolManager1 property value.
 * @return uts.export.map.QueryportofdischargebolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QueryportofdischargebolManager getQueryportofdischargebolManager1() {
	if (ivjQueryportofdischargebolManager1 == null) {
		try {
			ivjQueryportofdischargebolManager1 = new uts.export.map.QueryportofdischargebolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQueryportofdischargebolManager1;
}
/**
 * Return the QueryportofloadingbolManager1 property value.
 * @return uts.export.map.QueryportofloadingbolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QueryportofloadingbolManager getQueryportofloadingbolManager1() {
	if (ivjQueryportofloadingbolManager1 == null) {
		try {
			ivjQueryportofloadingbolManager1 = new uts.export.map.QueryportofloadingbolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQueryportofloadingbolManager1;
}
/**
 * Return the QueryshipownerbolManager1 property value.
 * @return uts.export.map.QueryshipownerbolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QueryshipownerbolManager getQueryshipownerbolManager1() {
	if (ivjQueryshipownerbolManager1 == null) {
		try {
			ivjQueryshipownerbolManager1 = new uts.export.map.QueryshipownerbolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQueryshipownerbolManager1;
}
/**
 * Return the QueryshipperbolManager1 property value.
 * @return uts.export.map.QueryshipperbolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QueryshipperbolManager getQueryshipperbolManager1() {
	if (ivjQueryshipperbolManager1 == null) {
		try {
			ivjQueryshipperbolManager1 = new uts.export.map.QueryshipperbolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQueryshipperbolManager1;
}
/**
 * Return the QueryvesselbolManager11 property value.
 * @return uts.export.map.QueryvesselbolManager
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private uts.export.map.QueryvesselbolManager getQueryvesselbolManager11() {
	if (ivjQueryvesselbolManager11 == null) {
		try {
			ivjQueryvesselbolManager11 = new uts.export.map.QueryvesselbolManager();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjQueryvesselbolManager11;
}
/**
 * Return the TextArea1 property value.
 * @return java.awt.TextArea
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextArea getTextArea1() {
	if (ivjTextArea1 == null) {
		try {
			ivjTextArea1 = new java.awt.TextArea();
			ivjTextArea1.setName("TextArea1");
			ivjTextArea1.setRows(2);
			ivjTextArea1.setText("where ");
			ivjTextArea1.setBackground(java.awt.SystemColor.controlLtHighlight);
			ivjTextArea1.setColumns(20);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextArea1;
}
/**
 * Return the TextField1 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField1() {
	if (ivjTextField1 == null) {
		try {
			ivjTextField1 = new java.awt.TextField();
			ivjTextField1.setName("TextField1");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField1;
}
/**
 * Return the TextField10 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField10() {
	if (ivjTextField10 == null) {
		try {
			ivjTextField10 = new java.awt.TextField();
			ivjTextField10.setName("TextField10");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField10;
}
/**
 * Return the TextField11 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField11() {
	if (ivjTextField11 == null) {
		try {
			ivjTextField11 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField11.setName("TextField11");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField11;
}
/**
 * Return the TextField12 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField12() {
	if (ivjTextField12 == null) {
		try {
			ivjTextField12 = new java.awt.TextField();
			ivjTextField12.setName("TextField12");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField12;
}
/**
 * Return the TextField13 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField13() {
	if (ivjTextField13 == null) {
		try {
			ivjTextField13 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField13.setName("TextField13");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField13;
}
/**
 * Return the TextField14 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField14() {
	if (ivjTextField14 == null) {
		try {
			ivjTextField14 = new java.awt.TextField();
			ivjTextField14.setName("TextField14");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField14;
}
/**
 * Return the TextField141 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField141() {
	if (ivjTextField141 == null) {
		try {
			ivjTextField141 = new java.awt.TextField();
			ivjTextField141.setName("TextField141");
			ivjTextField141.setBounds(155, 113, 40, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField141;
}
/**
 * Return the TextField1411 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField1411() {
	if (ivjTextField1411 == null) {
		try {
			ivjTextField1411 = new java.awt.TextField();
			ivjTextField1411.setName("TextField1411");
			ivjTextField1411.setText("2001");
			ivjTextField1411.setBounds(213, 113, 65, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField1411;
}
/**
 * Return the TextField14111 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField14111() {
	if (ivjTextField14111 == null) {
		try {
			ivjTextField14111 = new java.awt.TextField();
			ivjTextField14111.setName("TextField14111");
			ivjTextField14111.setText("2001");
			ivjTextField14111.setBounds(215, 72, 65, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField14111;
}
/**
 * Return the TextField1412 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField1412() {
	if (ivjTextField1412 == null) {
		try {
			ivjTextField1412 = new java.awt.TextField();
			ivjTextField1412.setName("TextField1412");
			ivjTextField1412.setBounds(157, 72, 40, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField1412;
}
/**
 * Return the TextField142 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField142() {
	if (ivjTextField142 == null) {
		try {
			ivjTextField142 = new java.awt.TextField();
			ivjTextField142.setName("TextField142");
			ivjTextField142.setBounds(92, 72, 41, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField142;
}
/**
 * Return the TextField143 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField143() {
	if (ivjTextField143 == null) {
		try {
			ivjTextField143 = new java.awt.TextField();
			ivjTextField143.setName("TextField143");
			ivjTextField143.setBounds(90, 113, 41, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField143;
}
/**
 * Return the TextField15 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField15() {
	if (ivjTextField15 == null) {
		try {
			ivjTextField15 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField15.setName("TextField15");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField15;
}
/**
 * Return the TextField16 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField16() {
	if (ivjTextField16 == null) {
		try {
			ivjTextField16 = new java.awt.TextField();
			ivjTextField16.setName("TextField16");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField16;
}
/**
 * Return the TextField17 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField17() {
	if (ivjTextField17 == null) {
		try {
			ivjTextField17 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField17.setName("TextField17");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField17;
}
/**
 * Return the TextField171 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField171() {
	if (ivjTextField171 == null) {
		try {
			ivjTextField171 = new java.awt.TextField();
			ivjTextField171.setName("TextField171");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField171;
}
/**
 * Return the TextField18 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField18() {
	if (ivjTextField18 == null) {
		try {
			ivjTextField18 = new java.awt.TextField();
			ivjTextField18.setName("TextField18");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField18;
}
/**
 * Return the TextField181 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField181() {
	if (ivjTextField181 == null) {
		try {
			ivjTextField181 = new java.awt.TextField();
			ivjTextField181.setName("TextField181");
			ivjTextField181.setText("2000");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField181;
}
/**
 * Return the TextField19 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField19() {
	if (ivjTextField19 == null) {
		try {
			ivjTextField19 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField19.setName("TextField19");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField19;
}
/**
 * Return the TextField191 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField191() {
	if (ivjTextField191 == null) {
		try {
			ivjTextField191 = new java.awt.TextField();
			ivjTextField191.setName("TextField191");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField191;
}
/**
 * Return the TextField2 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField2() {
	if (ivjTextField2 == null) {
		try {
			ivjTextField2 = new java.awt.TextField();
			ivjTextField2.setName("TextField2");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField2;
}
/**
 * Return the TextField20 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField20() {
	if (ivjTextField20 == null) {
		try {
			ivjTextField20 = new java.awt.TextField();
			ivjTextField20.setName("TextField20");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField20;
}
/**
 * Return the TextField201 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField201() {
	if (ivjTextField201 == null) {
		try {
			ivjTextField201 = new java.awt.TextField();
			ivjTextField201.setName("TextField201");
			ivjTextField201.setBounds(35, 48, 242, 23);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField201;
}
/**
 * Return the TextField21 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField21() {
	if (ivjTextField21 == null) {
		try {
			ivjTextField21 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField21.setName("TextField21");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField21;
}
/**
 * Return the TextField22 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField22() {
	if (ivjTextField22 == null) {
		try {
			ivjTextField22 = new java.awt.TextField();
			ivjTextField22.setName("TextField22");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField22;
}
/**
 * Return the TextField23 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField23() {
	if (ivjTextField23 == null) {
		try {
			ivjTextField23 = new java.awt.TextField();
			ivjTextField23.setName("TextField23");
			ivjTextField23.setEditable(false);
			ivjTextField23.setEnabled(false);
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField23;
}
/**
 * Return the TextField24 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField24() {
	if (ivjTextField24 == null) {
		try {
			ivjTextField24 = new java.awt.TextField();
			ivjTextField24.setName("TextField24");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField24;
}
/**
 * Return the TextField25 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField25() {
	if (ivjTextField25 == null) {
		try {
			ivjTextField25 = new java.awt.TextField();
			ivjTextField25.setName("TextField25");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField25;
}
/**
 * Return the TextField26 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField26() {
	if (ivjTextField26 == null) {
		try {
			ivjTextField26 = new java.awt.TextField();
			ivjTextField26.setName("TextField26");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField26;
}
/**
 * Return the TextField3 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField3() {
	if (ivjTextField3 == null) {
		try {
			ivjTextField3 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField3.setName("TextField3");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField3;
}
/**
 * Return the TextField4 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField4() {
	if (ivjTextField4 == null) {
		try {
			ivjTextField4 = new java.awt.TextField();
			ivjTextField4.setName("TextField4");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField4;
}
/**
 * Return the TextField5 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField5() {
	if (ivjTextField5 == null) {
		try {
			ivjTextField5 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField5.setName("TextField5");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField5;
}
/**
 * Return the TextField6 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField6() {
	if (ivjTextField6 == null) {
		try {
			ivjTextField6 = new java.awt.TextField();
			ivjTextField6.setName("TextField6");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField6;
}
/**
 * Return the TextField7 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField7() {
	if (ivjTextField7 == null) {
		try {
			ivjTextField7 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField7.setName("TextField7");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField7;
}
/**
 * Return the TextField8 property value.
 * @return java.awt.TextField
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private java.awt.TextField getTextField8() {
	if (ivjTextField8 == null) {
		try {
			ivjTextField8 = new java.awt.TextField();
			ivjTextField8.setName("TextField8");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField8;
}
/**
 * Return the TextField9 property value.
 * @return com.ibm.objectcombobox.ObjectComboBox
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private com.ibm.objectcombobox.ObjectComboBox getTextField9() {
	if (ivjTextField9 == null) {
		try {
			ivjTextField9 = new com.ibm.objectcombobox.ObjectComboBox();
			ivjTextField9.setName("TextField9");
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
	return ivjTextField9;
}
/**
 * Called whenever the part throws an exception.
 * @param exception java.lang.Throwable
 */
private void handleException(Throwable exception) {

	/* Uncomment the following lines to print uncaught exceptions to stdout */
	// System.out.println("--------- UNCAUGHT EXCEPTION ---------");
	// exception.printStackTrace(System.out);
}
/**
 * Initializes connections
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initConnections() {
	// user code begin {1}
	// user code end
	this.addWindowListener(this);
	getButton1().addActionListener(this);
	getButton3().addActionListener(this);
	this.addWindowListener(this);
	getButton9().addActionListener(this);
	getBolResultForm1().addItemListener(this);
	getTextField1().addTextListener(this);
	getTextField23().addTextListener(this);
	getTextField25().addTextListener(this);
	getTextField2().addTextListener(this);
	getTextField4().addTextListener(this);
	getTextField6().addTextListener(this);
	getTextField8().addTextListener(this);
	getTextField10().addTextListener(this);
	getTextField12().addTextListener(this);
	getTextField14().addTextListener(this);
	getTextField16().addTextListener(this);
	getTextField18().addTextListener(this);
	getTextField20().addTextListener(this);
	getTextField22().addTextListener(this);
	getTextField24().addTextListener(this);
	getTextField26().addTextListener(this);
	getButton111().addActionListener(this);
	getButton7().addActionListener(this);
	getButton5().addActionListener(this);
	getButton4().addActionListener(this);
	getButton6().addActionListener(this);
	getDialog11().addWindowListener(this);
	getButton191().addActionListener(this);
	getLabel23().addActionListener(this);
	getDialog1().addWindowListener(this);
	getButton8().addActionListener(this);
	getLabel3().addActionListener(this);
	getTextField3().addComboBoxListListener(this);
	getTextField5().addComboBoxListListener(this);
	getTextField7().addComboBoxListListener(this);
	getTextField9().addComboBoxListListener(this);
	getTextField11().addComboBoxListListener(this);
	getTextField13().addComboBoxListListener(this);
	getTextField15().addComboBoxListListener(this);
	getTextField17().addComboBoxListListener(this);
	getTextField19().addComboBoxListListener(this);
	getTextField21().addComboBoxListListener(this);
	getLabel5().addActionListener(this);
	getLabel7().addActionListener(this);
	getLabel13().addActionListener(this);
	getLabel9().addActionListener(this);
	getLabel11().addActionListener(this);
	getLabel15().addActionListener(this);
	getLabel17().addActionListener(this);
	getLabel19().addActionListener(this);
	getLabel21().addActionListener(this);
	getButton2().addActionListener(this);
	getDialogQuery().addWindowListener(this);
	getButton14().addActionListener(this);
	getButton21().addActionListener(this);
	getButton13().addActionListener(this);
	getButton16().addActionListener(this);
	getIList51().addItemListener(this);
	getButton15().addActionListener(this);
	getButton18().addActionListener(this);
	getButton19().addActionListener(this);
	getButton211().addActionListener(this);
	connPtoP1SetTarget();
	connPtoP2SetTarget();
	connPtoP3SetTarget();
	connPtoP14SetTarget();
	connPtoP15SetTarget();
	connPtoP16SetTarget();
	connPtoP17SetTarget();
	connPtoP18SetTarget();
	connPtoP19SetTarget();
	connPtoP20SetTarget();
	connPtoP21SetTarget();
	connPtoP22SetTarget();
	connPtoP23SetTarget();
	connPtoP24SetTarget();
	connPtoP25SetTarget();
	connPtoP26SetTarget();
	connPtoP27SetTarget();
	connPtoP28SetTarget();
	connPtoP29SetTarget();
	connPtoP4SetTarget();
	connPtoP5SetTarget();
	connPtoP6SetTarget();
	connPtoP7SetTarget();
	connPtoP8SetTarget();
	connPtoP9SetTarget();
	connPtoP10SetTarget();
	connPtoP11SetTarget();
	connPtoP12SetTarget();
	connPtoP13SetTarget();
}
/**
 * Initialize the class.
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void initialize() {
	// user code begin {1}
	// user code end
	setName("Export");
	setLayout(new java.awt.BorderLayout());
	setSize(625, 340);
	setTitle("\u042D\u043A\u0441\u043F\u043E\u0440\u0442");
	add(getContentsPane(), "Center");
	initConnections();
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the ComboBoxListListener interface.
 * @param arg1 com.ibm.objectcombobox.ComboBoxListEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void itemAdded(com.ibm.objectcombobox.ComboBoxListEvent arg1) {
	// user code begin {1}
	// user code end
	if ((arg1.getSource() == getTextField3()) ) {
		connEtoM27();
	}
	if ((arg1.getSource() == getTextField5()) ) {
		connEtoM30();
	}
	if ((arg1.getSource() == getTextField7()) ) {
		connEtoM32();
	}
	if ((arg1.getSource() == getTextField9()) ) {
		connEtoM34();
	}
	if ((arg1.getSource() == getTextField11()) ) {
		connEtoM36();
	}
	if ((arg1.getSource() == getTextField13()) ) {
		connEtoM38();
	}
	if ((arg1.getSource() == getTextField15()) ) {
		connEtoM40();
	}
	if ((arg1.getSource() == getTextField17()) ) {
		connEtoM42();
	}
	if ((arg1.getSource() == getTextField19()) ) {
		connEtoM44();
	}
	if ((arg1.getSource() == getTextField21()) ) {
		connEtoM46();
	}
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the ComboBoxListListener interface.
 * @param arg1 com.ibm.objectcombobox.ComboBoxListEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void itemRemoved(com.ibm.objectcombobox.ComboBoxListEvent arg1) {
	// user code begin {1}
	// user code end
	if ((arg1.getSource() == getTextField3()) ) {
		connEtoM27();
	}
	if ((arg1.getSource() == getTextField5()) ) {
		connEtoM30();
	}
	if ((arg1.getSource() == getTextField7()) ) {
		connEtoM32();
	}
	if ((arg1.getSource() == getTextField9()) ) {
		connEtoM34();
	}
	if ((arg1.getSource() == getTextField11()) ) {
		connEtoM36();
	}
	if ((arg1.getSource() == getTextField13()) ) {
		connEtoM38();
	}
	if ((arg1.getSource() == getTextField15()) ) {
		connEtoM40();
	}
	if ((arg1.getSource() == getTextField17()) ) {
		connEtoM42();
	}
	if ((arg1.getSource() == getTextField19()) ) {
		connEtoM44();
	}
	if ((arg1.getSource() == getTextField21()) ) {
		connEtoM46();
	}
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the ComboBoxListListener interface.
 * @param arg1 com.ibm.objectcombobox.ComboBoxListEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void itemSelected(com.ibm.objectcombobox.ComboBoxListEvent arg1) {
	// user code begin {1}
	// user code end
	if ((arg1.getSource() == getTextField3()) ) {
		connEtoM27();
	}
	if ((arg1.getSource() == getTextField5()) ) {
		connEtoM30();
	}
	if ((arg1.getSource() == getTextField7()) ) {
		connEtoM32();
	}
	if ((arg1.getSource() == getTextField9()) ) {
		connEtoM34();
	}
	if ((arg1.getSource() == getTextField11()) ) {
		connEtoM36();
	}
	if ((arg1.getSource() == getTextField13()) ) {
		connEtoM38();
	}
	if ((arg1.getSource() == getTextField15()) ) {
		connEtoM40();
	}
	if ((arg1.getSource() == getTextField17()) ) {
		connEtoM42();
	}
	if ((arg1.getSource() == getTextField19()) ) {
		connEtoM44();
	}
	if ((arg1.getSource() == getTextField21()) ) {
		connEtoM46();
	}
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the ItemListener interface.
 * @param e java.awt.event.ItemEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void itemStateChanged(java.awt.event.ItemEvent e) {
	// user code begin {1}
	// user code end
	if ((e.getSource() == getBolResultForm1()) ) {
		connEtoM8(e);
	}
	if ((e.getSource() == getIList51()) ) {
		connEtoM80(e);
	}
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the ComboBoxListListener interface.
 * @param arg1 com.ibm.objectcombobox.ComboBoxListEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void itemValueChanged(com.ibm.objectcombobox.ComboBoxListEvent arg1) {
	// user code begin {1}
	// user code end
	if ((arg1.getSource() == getTextField3()) ) {
		connEtoM27();
	}
	if ((arg1.getSource() == getTextField5()) ) {
		connEtoM30();
	}
	if ((arg1.getSource() == getTextField7()) ) {
		connEtoM32();
	}
	if ((arg1.getSource() == getTextField9()) ) {
		connEtoM34();
	}
	if ((arg1.getSource() == getTextField11()) ) {
		connEtoM36();
	}
	if ((arg1.getSource() == getTextField13()) ) {
		connEtoM38();
	}
	if ((arg1.getSource() == getTextField15()) ) {
		connEtoM40();
	}
	if ((arg1.getSource() == getTextField17()) ) {
		connEtoM42();
	}
	if ((arg1.getSource() == getTextField19()) ) {
		connEtoM44();
	}
	if ((arg1.getSource() == getTextField21()) ) {
		connEtoM46();
	}
	// user code begin {2}
	// user code end
}
/**
 * main entrypoint - starts the part when it is run as an application
 * @param args java.lang.String[]
 */
public static void main(java.lang.String[] args) {
	try {
		Export aExport;
		aExport = new Export();
		try {
			Class aCloserClass = Class.forName("com.ibm.uvm.abt.edit.WindowCloser");
			Class parmTypes[] = { java.awt.Window.class };
			Object parms[] = { aExport };
			java.lang.reflect.Constructor aCtor = aCloserClass.getConstructor(parmTypes);
			aCtor.newInstance(parms);
		} catch (java.lang.Throwable exc) {};
		aExport.setVisible(true);
	} catch (Throwable exception) {
		System.err.println("Exception occurred in main() of java.awt.Frame");
		exception.printStackTrace(System.out);
	}
}
/**
 * Method to handle events for the PropertyChangeListener interface.
 * @param evt java.beans.PropertyChangeEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void propertyChange(java.beans.PropertyChangeEvent evt) {
	// user code begin {1}
	// user code end
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("n"))) {
		connPtoP3SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("idate"))) {
		connPtoP14SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("master"))) {
		connPtoP15SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("name"))) {
		connPtoP16SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("namerus"))) {
		connPtoP17SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("weight"))) {
		connPtoP18SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("quantity"))) {
		connPtoP19SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("gross_weight"))) {
		connPtoP20SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("netweight"))) {
		connPtoP21SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("marking"))) {
		connPtoP22SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("options"))) {
		connPtoP23SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("bols"))) {
		connPtoP24SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("mnfstbot"))) {
		connPtoP25SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("descript"))) {
		connPtoP26SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("contract"))) {
		connPtoP27SetTarget();
	}
	if ((evt.getSource() == getBol1()) && (evt.getPropertyName().equals("note"))) {
		connPtoP28SetTarget();
	}
	// user code begin {2}
	// user code end
}
/**
 * Set the Bol1 to a new value.
 * @param newValue uts.export.map.Bol
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void setBol1(uts.export.map.Bol newValue) {
	if (ivjBol1 != newValue) {
		try {
			/* Stop listening for events from the current object */
			if (ivjBol1 != null) {
				ivjBol1.removePropertyChangeListener(this);
			}
			ivjBol1 = newValue;

			/* Listen for events from the new object */
			if (ivjBol1 != null) {
				ivjBol1.addPropertyChangeListener(this);
			}
			connPtoP3SetTarget();
			connPtoP14SetTarget();
			connPtoP15SetTarget();
			connPtoP16SetTarget();
			connPtoP17SetTarget();
			connPtoP18SetTarget();
			connPtoP19SetTarget();
			connPtoP20SetTarget();
			connPtoP21SetTarget();
			connPtoP22SetTarget();
			connPtoP23SetTarget();
			connPtoP24SetTarget();
			connPtoP25SetTarget();
			connPtoP26SetTarget();
			connPtoP27SetTarget();
			connPtoP28SetTarget();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
}
/**
 * Set the CardLayout1 to a new value.
 * @param newValue java.awt.CardLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void setCardLayout1(java.awt.CardLayout newValue) {
	if (ivjCardLayout1 != newValue) {
		try {
			ivjCardLayout1 = newValue;
			connPtoP1SetSource();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
}
/**
 * Set the CardLayout2 to a new value.
 * @param newValue java.awt.CardLayout
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
private void setCardLayout2(java.awt.CardLayout newValue) {
	if (ivjCardLayout2 != newValue) {
		try {
			ivjCardLayout2 = newValue;
			connPtoP13SetSource();
			// user code begin {1}
			// user code end
		} catch (java.lang.Throwable ivjExc) {
			// user code begin {2}
			// user code end
			handleException(ivjExc);
		}
	};
}
/**
 * Comment
 */
public String setData(String year, String month, String day) {
	return(year + "-" + month + "-" + day);
}
/**
 * Method to handle events for the TextListener interface.
 * @param e java.awt.event.TextEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void textValueChanged(java.awt.event.TextEvent e) {
	// user code begin {1}
	// user code end
	if ((e.getSource() == getTextField1()) ) {
		connPtoP3SetSource();
	}
	if ((e.getSource() == getTextField23()) ) {
		connPtoP14SetSource();
	}
	if ((e.getSource() == getTextField25()) ) {
		connPtoP15SetSource();
	}
	if ((e.getSource() == getTextField2()) ) {
		connPtoP16SetSource();
	}
	if ((e.getSource() == getTextField4()) ) {
		connPtoP17SetSource();
	}
	if ((e.getSource() == getTextField6()) ) {
		connPtoP18SetSource();
	}
	if ((e.getSource() == getTextField8()) ) {
		connPtoP19SetSource();
	}
	if ((e.getSource() == getTextField10()) ) {
		connPtoP20SetSource();
	}
	if ((e.getSource() == getTextField12()) ) {
		connPtoP21SetSource();
	}
	if ((e.getSource() == getTextField14()) ) {
		connPtoP22SetSource();
	}
	if ((e.getSource() == getTextField16()) ) {
		connPtoP23SetSource();
	}
	if ((e.getSource() == getTextField18()) ) {
		connPtoP24SetSource();
	}
	if ((e.getSource() == getTextField20()) ) {
		connPtoP25SetSource();
	}
	if ((e.getSource() == getTextField22()) ) {
		connPtoP26SetSource();
	}
	if ((e.getSource() == getTextField24()) ) {
		connPtoP27SetSource();
	}
	if ((e.getSource() == getTextField26()) ) {
		connPtoP28SetSource();
	}
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the WindowListener interface.
 * @param e java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void windowActivated(java.awt.event.WindowEvent e) {
	// user code begin {1}
	// user code end
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the WindowListener interface.
 * @param e java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void windowClosed(java.awt.event.WindowEvent e) {
	// user code begin {1}
	// user code end
	if ((e.getSource() == this) ) {
		connEtoM4(e);
	}
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the WindowListener interface.
 * @param e java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void windowClosing(java.awt.event.WindowEvent e) {
	// user code begin {1}
	// user code end
	if ((e.getSource() == this) ) {
		connEtoC1(e);
	}
	if ((e.getSource() == getDialog11()) ) {
		connEtoM18(e);
	}
	if ((e.getSource() == getDialog1()) ) {
		connEtoM21(e);
	}
	if ((e.getSource() == getDialogQuery()) ) {
		connEtoM66(e);
	}
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the WindowListener interface.
 * @param e java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void windowDeactivated(java.awt.event.WindowEvent e) {
	// user code begin {1}
	// user code end
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the WindowListener interface.
 * @param e java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void windowDeiconified(java.awt.event.WindowEvent e) {
	// user code begin {1}
	// user code end
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the WindowListener interface.
 * @param e java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void windowIconified(java.awt.event.WindowEvent e) {
	// user code begin {1}
	// user code end
	// user code begin {2}
	// user code end
}
/**
 * Method to handle events for the WindowListener interface.
 * @param e java.awt.event.WindowEvent
 */
/* WARNING: THIS METHOD WILL BE REGENERATED. */
public void windowOpened(java.awt.event.WindowEvent e) {
	// user code begin {1}
	// user code end
	if ((e.getSource() == this) ) {
		connEtoM3(e);
	}
	// user code begin {2}
	// user code end
}
}