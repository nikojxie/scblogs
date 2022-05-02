package cn.sticki.blog.mapper;

import cn.sticki.blog.pojo.domain.UserLikeBlog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserLikeBlogMapper extends BaseMapper<UserLikeBlog> {

	@MapKey("value")
	Map<Integer, Integer> selectMapByUserIdAndBlogIdList(Integer userId, List<Integer> blogIdList);

}
