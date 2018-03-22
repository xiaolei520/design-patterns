package cn.evan.designPatterns.composite;


/**
 * <p>为组合中的对象声明接口。</p>
   <p> 在适当的情况下，实现所有类共有接口的缺省行为。</p>
   <p>声明一个接口用于访问和管理Componebt 的子组件。</p>
   <p>在递归结构中定义一个接口，用于访问一个父组件，并在合适的情况下实现。</p>
 *
 */
public interface Component {

	public int getSize();
	
	public int getChildNum();
	
	public String getName();
	
	public String getType();
	
	public void add(Component c);
	
	public void remove(Component c);
}
