package cn.aofeng.event4j;

/**
 * {@link EventListener}用于单元测试的Mock。
 * 
 * @author <a href="mailto:aofengblog@163.com">聂勇</a>
 */
public class EventListenerMock2 extends AbstractEventListener<DataObj> {

    @Override
    public void execute(Event<DataObj> event) {
        // nothing
    }

}
