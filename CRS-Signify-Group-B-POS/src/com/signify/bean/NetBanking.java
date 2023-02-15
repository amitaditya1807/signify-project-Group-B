/**
 * 
 */
package com.signify.bean;

/**
 * @author AMIT KUMAR
 *
 */
public class NetBanking extends Online{
	private String modeOfTransfer;
	/**
	 * @return the modeOfTransfer
	 */
	public String getModeOfTransfer() {
		return modeOfTransfer;
	}
	/**
	 * @param modeOfTransfer the modeOfTransfer to set
	 */
	public void setModeOfTransfer(String modeOfTransfer) {
		this.modeOfTransfer = modeOfTransfer;
	}
	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the iFSCcode
	 */
	public String getIFSCcode() {
		return IFSCcode;
	}
	/**
	 * @param iFSCcode the iFSCcode to set
	 */
	public void setIFSCcode(String iFSCcode) {
		IFSCcode = iFSCcode;
	}
	private int accountNumber;
	private String IFSCcode;
}
