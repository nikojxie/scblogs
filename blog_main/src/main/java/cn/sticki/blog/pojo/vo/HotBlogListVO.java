package cn.sticki.blog.pojo.vo;

import cn.sticki.blog.pojo.dto.UserBlogActionStatusDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@Data
public class HotBlogListVO extends BlogListVO {

	Map<Integer, UserBlogActionStatusDTO> userAction;

}
