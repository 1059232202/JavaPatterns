/**   
* @Title: SourceableStub2.java 
* @Package com.brucelee.javapatterns.bridge 
* @Description: TODO(用一句话描述该文件做什么) 
* @author robertlee1059@163.com   
* @date 2015-3-30 下午2:18:26 
*/
package com.brucelee.javapatterns.bridge;

/** 
 * @ClassName: SourceableStub2 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author robertlee1059@163.com 
 * @date 2015-3-30 下午2:18:26 
 *  
 */
public class SourceableStub2 implements Sourceable {

	@Override
	public void method() {
		System.out.println("我是源SourceStub2的method()");
	}

}
