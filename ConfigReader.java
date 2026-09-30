package automation.pages.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.Properties;

public class ConfigReader {

	Properties prop;
	
	public ConfigReader() {
	
     
try {
	FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
	
	prop = new Properties();
	
	prop.load(fis);
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

   
	
	}
	
	
	// this is use for the intilization to read the property 7
	
	
public String getBrowser() {
		
		return prop.getProperty("browser");
		
}
	
	public String getUrl() {
		
		return prop.getProperty("url");
		
	}
	
	public String getEmail() {
		
		return prop.getProperty("email");
		
	}
	
	
	public String getUserEmailID() {
		
		return prop.getProperty("UserEmailId");
		
	}
	
	public String getUserPassword() {
		
		return prop.getProperty("UserPassword");
	}
	
	
	public String getPassword() {
		
		return prop.getProperty("password");
		
	}
	
	
	public String getHighContrastSwitch() {
		
		return prop.getProperty("HighContrastSwitch");
	}
	
	
	
	public String gettimeZone() {
		return prop.getProperty("timeZone");
	}
	
	public String getOrganisation() {
		
		return prop.getProperty("organisation");
		
	}
	
	public String getUser() {
		return prop.getProperty("user");
	}
	
	public String inviteUser() {
		return prop.getProperty("inviteUser");
	}
	
 public String getFirstName() {
	 return prop.getProperty("firstName");
	  
 }
 
 public String getLastName() {
	 
	 return prop.getProperty("lastName");
 }
 
 public String getEmailID() {
	 
	 return prop.getProperty("emailID");
 }
 
 
 public String getLocation() {
	 
	 return prop.getProperty("location");
 }
 
 
 public String getparentLocation() {
	 return prop.getProperty("parentLocation");
 }
 
 
 public String getTheme() {
	 
	 return prop.getProperty("theme");
 }

 
 public String getlanguage() {
	 
	 return prop.getProperty("language");
	 
 }
 
 
 public String getZoom() {
	 
	 return prop.getProperty("Zoom");
 }
 

 public String getRoomname() {
	 
	 return prop.getProperty("Roomname");
 }
 
 
 public String getTags() {
	 
	 return prop.getProperty("tags");
			 
 }
 
 
 public String getDuration() {
	 
	 return prop.getProperty("duration");
 }
 
 
 public String getCapacity() {
	 
	 return prop.getProperty("Capacity");
 }
 
 
 public String getEquipment1() {
	    return prop.getProperty("equipment1");
	}

	public String getEquipment2() {
	    return prop.getProperty("equipment2");
	}

	public String getEquipment3() {
	    return prop.getProperty("equipment3");
	}
 
 public String getAdvanceOption1() {
	 
	 return prop.getProperty("advanceoption");
 }
 
 
 public String getPrepration() {
	 
	 return prop.getProperty("prepration");
			 
 }
 
 
 public String getCheckbox() {
	 
	 return prop.getProperty("Checkbox");
 }
 
 public String getDeskName() {
	 
	 return prop.getProperty("deskname");
 }
 
 
 public String getAdvanceOption2() {
	 
	 return prop.getProperty("advanceoptions");
 }
 
 
 public String getstarttime() {
	 
	 return prop.getProperty("starttime");
 }
 
 
 public String getendtime() {
	 
	 return prop.getProperty("endtime");
	 
 }
 
 public String getsuffprefix() {
	 
	return prop.getProperty("suffprefix"); 
 }
 
 
 
 // computers 
 
 public String getComputerName() {
	 
	 return prop.getProperty("addname");
	 
 }
 
 public String getComputerID() {
	 
	 return prop.getProperty("addID");
	
 }
 
 
 public String getnoshowwaitTime() {
	 
	 return prop.getProperty("noshowwaitTime");
	 
 }
 
 public String getLevelWarnining() {
	 
	 return prop.getProperty("level1Warning");
	 
 }
 
 
 public String getLevelWarning2() {
	 
	 return prop.getProperty("level2WarningMessage");
	 
 }
 
 
 public String getLevelLevelWarning3() {
	 
	 return prop.getProperty("level3Warning");
 }
 
 
 public String getInactivityTimeout() {
	 
	 return prop.getProperty("inactivityTimeout");
 }
 
 
 public String getLockTime() {
	 
	 return prop.getProperty("lockTimeout");
 }
 
 
 
public String getReserveLocation() {
	
	return prop.getProperty("location");
	
}


public String getstartTime() {
	
	return prop.getProperty("startTime");
}


public String getStartTime1() {
	
	return prop.getProperty("StartTime1");
}

public String getStartTime2() {
	
	return prop.getProperty("StartTime2");


}



public String getDirectory() {
	
	return prop.getProperty("Directory");
}




public String getPleasechoose() {
	
	return prop.getProperty("Pleasechoose");
}


public String getRoomTags() {
	
	return prop.getProperty("RoomTags");
	
}


public String getRoomName() {
	
	return prop.getProperty("RoomName");
	
}


public String getDeskTagName() {
	
	return prop.getProperty("DeskTags");
}


public String getComputerTags() {
	
	return prop.getProperty("ComputerTags");
}


public String getUsersTag() {
	
	return prop.getProperty("UsersTag");
}

public String getTags2() {
	
	return prop.getProperty("tags");
}

public String getLocation2() {
	
	return prop.getProperty("Testing");
}

public String getLocations() {
	
	return prop.getProperty("Locations");
}


public String getUserTag() {
	
	return prop.getProperty("UsersTag");
}

public String getAdminPolicy() {
	
	return prop.getProperty("AdminPolicy");
}

public String getName() {
    return prop.getProperty("Name");
}

public String getUserprefix() {
    return prop.getProperty("Userprefix");
}

public String getNumberoffigure() {
    return prop.getProperty("Numberoffigure");
}

public String getLength() {
    return prop.getProperty("length");
}

public String getActivation() {
    return prop.getProperty("Activation");

}

public String getperiod() {
	
	return prop.getProperty("period");
}
	
public String getBookingType() {
	
	return prop.getProperty("BookingType");
}

public String getperiods() {
	
	return prop.getProperty("periods");
}

// Audit Log Report

public String getCateory() {
	
	return prop.getProperty("Cateory");
}

public String getContext() {
	
	return prop.getProperty("context");
	
}
public String getUsername() {
	
	return prop.getProperty("Username");

	
}

public String getPassword1() {
	
	return prop.getProperty("Password1");
}


public String getCheckbox1() {
	
	return prop.getProperty("Checkbox");
}



public String getStartHour() {

    return prop.getProperty("startHour");
}


public String getStartMinute() {

    return prop.getProperty("startMinute");
}


public String getStartPeriod() {

    return prop.getProperty("startPeriod");
}
 

public String getsourceuser() {
	
	return prop.getProperty("sourceuser");
}
 
public String getusertagss() {
	
	return prop.getProperty("usertagss");
}


// guest users 

public String getCharacter() {
	return prop.getProperty("Character");
}

public String getExpried() {
	
	return prop.getProperty("userexpiryperiod");
	
}


public String getNumberofPeriod() {
	
	return prop.getProperty("NumberofPeriod");
}

public String getnumberofextensions() {
	
	return prop.getProperty("numberofextension");
}

public String getmaximumperiodtobookinadvance() {
    return prop.getProperty("MaxmiumPeriodToBookinAdvance");
}



public String getAuth1() {
    return prop.getProperty("auth1");
}

public String getAuth2() {
    return prop.getProperty("auth2");
}

public String getAuth3() {
    return prop.getProperty("auth3");
}

public String getAuth4() {
    return prop.getProperty("auth4");
}

public String getAuth5() {
	return prop.getProperty("auth5");
	
}

public String getTooltip1() {
    return prop.getProperty("tooltip1");
}

public String getTooltip2() {
    return prop.getProperty("tooltip2");
}

public String getResource1() {
    return prop.getProperty("resource1");
}

public String getResource2() {
    return prop.getProperty("resource2");
}

public String getResource3() {
    return prop.getProperty("resource3");
}

// Computer Booking rules 


public String getMaximumPerMonth() {
    return prop.getProperty("MaxmiumBookingPerMonth");
}

public String getMaxiumBookingDuration() {
    return prop.getProperty("BookingDuration");
}

public String getBookingPerDay() {
    return prop.getProperty("BookingPerDay");
}

public String getBookingAllowedPerDay() {
    return prop.getProperty("BookingAllowedPerDay");
}

public String getMaxiumperiodAdvance() {
    return prop.getProperty("MaxmiumPeriodToBookinAdvance");
}

public String getMaxmiumallowperday() {
	return prop.getProperty("Maxmiumallowperday");
}

public String getMaxmiumExtendTime() {
	return prop.getProperty("MaxmiumExtendTime");

}

public String getMaxmiumNumberofBookingPerDay() {
	
	return prop.getProperty("MaxmiumNumberofBookingPerDay");

	
}



public String getHour() {
    return prop.getProperty("Hour");
}

public String getMinute() {
    return prop.getProperty("Minute");
}

public String getendHour() {
    return prop.getProperty("endHour");
}

public String getendMinute() {
    return prop.getProperty("endMinute");
}


public String getCustomName() {

    return prop.getProperty("customName");

}

public LocalDate getReserveBookingDate() {
    return LocalDate.of(2026, 9, 24);
}

public String getcheckIDs() {
	
	return prop.getProperty("checkIDs");
}

public String getCheckbox2() {
	
	return prop.getProperty("Checkbox2");
}

public String getResource() {
	return prop.getProperty("Resource");
	
}

public String getSourceRoom() {
	
	return prop.getProperty("SourceRoom");
}
}