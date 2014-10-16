package assignments;

import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@Results({
		@Result(name = "SUCCESS", type = "dispatcher", location = "top.jsp"),
		@Result(name = "SUCCESS", type = "dispatcher", location = "top.jsp")
})
public class TopAction {

}
