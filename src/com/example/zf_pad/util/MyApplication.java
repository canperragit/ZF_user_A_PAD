package com.example.zf_pad.util;

 
 
import java.util.LinkedList;
import java.util.List;

import com.example.zf_pad.entity.User;
import com.loopj.android.http.AsyncHttpClient;

 


import android.app.Activity;
import android.app.Application;
 
 
 

public class MyApplication extends Application{
	
	private static MyApplication  mInstance=null;
	//private ArrayList<Order> orderList = new ArrayList<Order>();
	/**
	 * 验证信息token
	 */
	private static  String versionCode="";
	private static int notifyId=0;
	private static Boolean isSelect=false;
	
	public static Boolean getIsSelect() {
		return isSelect;
	}
	public static void setIsSelect(Boolean isSelect) {
		MyApplication.isSelect = isSelect;
	}
	public static int getNotifyId() {
		return notifyId;
	}
	public static void setNotifyId(int notifyId) {
		MyApplication.notifyId = notifyId;
	}
	public static String getVersionCode() {
		return versionCode;
	}
	public static void setVersionCode(String versionCode) {
		MyApplication.versionCode = versionCode;
	}
	public static User getCurrentUser() {
		return currentUser;
	}
	public static void setCurrentUser(User currentUser) {
		MyApplication.currentUser = currentUser;
	}


	private static String token="";
	AsyncHttpClient client = new AsyncHttpClient(); //  
	
	public AsyncHttpClient getClient() {
		//client.setTimeout(6000);
		return client;
	}
	public void setClient(AsyncHttpClient client) {
		this.client = client;
	}
	public static String getToken() {
		return token;
	}
	public static void setToken(String token) {
		MyApplication.token = token;
	}


	/**
	 * 存储当前用户对象信息,需在welcome初始化用户信息
	 */
	public static User currentUser = new User();
	//运用list来保存们每一个activity是关键   
    private List<Activity> mList = new LinkedList<Activity>();   
 // add Activity     
    public void addActivity(Activity activity) {    
        mList.add(activity);    
    }    
    //关闭每一个list内的activity   
    public void exit() {    
        try {    
            for (Activity activity:mList) {    
                if (activity != null)    
                    activity.finish();    
            }    
        } catch (Exception e) {    
            e.printStackTrace();    
        } 
        
    }  
 

	@Override
	public void onCreate() {
		super.onCreate();
		mInstance = this;		 
//		initImageLoader(getApplicationContext());
//		SDKInitializer.initialize(this);
//		  PackageManager packageManager = getPackageManager();
//          // getPackageName()是你当前类的包名，0代表是获取版本信息
//          PackageInfo packInfo;
//		try {
//			packInfo = packageManager.getPackageInfo(getPackageName(),0);
//			  int version = packInfo.versionCode;
//			 setVersionCode(version+"");
//		} catch (NameNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}
	
//	private void initImageLoader(Context context) {
//		ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
//				context).memoryCache(new LruMemoryCache(2 * 1024 * 1024))
//				.memoryCacheSize(2 * 1024 * 1024)
//				.discCacheSize(50 * 1024 * 1024).discCacheFileCount(100)
//				.build();
//		ImageLoader.getInstance().init(config);
//	}
	public static MyApplication getInstance() {
		return mInstance;
	}
	
 
}
