package MissileCommando;
/* Semaphore class used to synchronize threads. */
class Semaphore
{
    private boolean taken;
    //--------------------
    Semaphore ()
    {
    	taken = false;
    }
    Semaphore (boolean taken)
    {
    	this.taken = taken;
    }
    public synchronized void take ()
    {
    	while (taken)
    	{
    		try
    		{
    			wait ();
    		}
    		catch (Exception e)
    		{
    		}
    	}
    	taken = true;
    }
    public synchronized boolean peek ()
    {
    	return taken;
    }
    public synchronized void give ()
    {
    	taken = false;
    	notify ();
    }
}