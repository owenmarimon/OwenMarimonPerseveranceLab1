/**
 * 
 */
package SecuritySystem;

import edu.fiu.sysdesign.SelfCheckCapable;
import edu.fiu.sysdesign.SelfCheckUtils;

/**
 * @author omari
 *
 */
public class AlarmSystem implements SelfCheckCapable {
	String Speakers;
	String TimeArmed;
	
	/**
	 * Notifies when suspicious activity occurs through sound.
	 */
	void AlertPersonnel() {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return "AlarmSystem";
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck();
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}

}
