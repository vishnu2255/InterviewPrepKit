package TestNew;

public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Entry<String,String> obj = new Entry<String, String>("test","value");
		System.out.println(obj);
		
		Entry<Boolean,String> obj2 = new Entry<Boolean,String>(false,"val2");
		System.out.println(obj2);
				
	}

}

class Entry<EntryKey,EntryValue>
{
	private EntryKey key;
	private EntryValue value;
	
	Entry(EntryKey key,EntryValue val)
	{
		this.key = key;
		this.value = val;
	}
	
	public EntryKey getKey()
	{
		return this.key;
	}
	
	public EntryValue getValue()
	{
		return this.value;
	}
	
	public String toString()
	{
		return this.key+" , "+ this.value;
	}
	
}
