import java.sql.Date;

public class bookingAttri {
private String CustName;
private String PackName;
private String CheckIn;
private String CheckOut;
private String Adults;
private  String Children;
private String PhoneNo;
public String getCustName() {
	return CustName;
}
public void setCustName(String custName) {
	CustName = custName;
}
public String getPackName() {
	return PackName;
}
public void setPackName(String packName) {
	PackName = packName;
}
public String getCheckIn() {
	return CheckIn;
}
public void setCheckIn(String checkIn) {
	CheckIn = checkIn;
}
public String getCheckOut() {
	return CheckOut;
}
public void setCheckOut(String checkOut) {
	CheckOut = checkOut;
}
public String getAdults() {
	return Adults;
}
public void setAdults(String adults) {
	Adults = adults;
}
public String getChildren() {
	return Children;
}
public void setChildren(String children) {
	Children = children;
}
public String getPhoneNo() {
	return PhoneNo;
}
public void setPhoneNo(String phoneNo) {
	PhoneNo = phoneNo;
}

}