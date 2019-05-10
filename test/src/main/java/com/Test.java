package com;

import com.alibaba.fastjson.JSONObject;
import com.base.core.tools.BaseTools;
import com.base.core.tools.EncryptTools;

public class Test {

	public static void main(String[] args) throws Exception{
		 System.out.println(EncryptTools.encryptDes(BaseTools.getCurStrDate(1), "bjtczzyf"));
		System.out.println(EncryptTools.encryptDes("1", "bjtczzyf"));
		System.out.println(EncryptTools.encryptDes("tcwy_cs", "bjtczzyf"));
		System.out.println(EncryptTools.encryptDes("bjtcwy", "bjtczzyf"));
		System.out.println(EncryptTools.encryptDes("HvUstmkifAFSjkk51IAEoMlZLSzi8WIOZMSKti7iOWRqXYD1SZipXOwD0IQ0VGtz", "bjtczzyf"));
		
		 JSONObject jsonObject = new JSONObject();
		 jsonObject.put("TAXPAYER_ID", "915001180605408770");
		System.out.println(EncryptTools.encryptDes(jsonObject.toJSONString(), "bjtczzyf")); 
	}

}
