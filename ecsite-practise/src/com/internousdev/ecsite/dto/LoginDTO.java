package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;
	private String userName;
    private String loginPassword;
    private boolean loginFlg = false;
	/**
	 * loginUserIdを取得します。
	 * @return loginUserId
	 */
	public String getLoginId() {
	    return loginId;
	}
	/**
	 * loginUserIdを設定します。
	 * @param loginUserId loginUserId
	 */
	public void setLoginId(String loginUserId) {
	    this.loginId = loginUserId;
	}
	/**
	 * userNameを取得します。
	 * @return userName
	 */
	public String getUserName() {
	    return userName;
	}
	/**
	 * userNameを設定します。
	 * @param userName userName
	 */
	public void setUserName(String userName) {
	    this.userName = userName;
	}
	/**
	 * loginPasswordを取得します。
	 * @return loginPassword
	 */
	public String getLoginPassword() {
	    return loginPassword;
	}
	/**
	 * loginPasswordを設定します。
	 * @param loginPassword loginPassword
	 */
	public void setLoginPassword(String loginPassword) {
	    this.loginPassword = loginPassword;
	}
	/**
	 * loginFlgを取得します。
	 * @return loginFlg
	 */
	public boolean getLoginFlg() {
	    return loginFlg;
	}
	/**
	 * loginFlgを設定します。
	 * @param loginFlg loginFlg
	 */
	public void setLoginFlg(boolean loginFlg) {
	    this.loginFlg = loginFlg;
	}


}