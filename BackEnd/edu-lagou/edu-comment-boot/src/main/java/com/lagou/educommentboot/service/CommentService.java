package com.lagou.educommentboot.service;

import com.lagou.eduapi.entity.CourseComment;

import java.util.List;

public interface CommentService {
    /**
     * 保存留言
     * @param comment 留言内容对象
     * @return 受影响的行数
     */
    Integer saveComment(CourseComment comment);

    /**
     * 某个课程的全部留言（分页）
     * @param courseid 课程编号
     * @param offset 数据偏移
     * @param pageSize 每页条目数
     * @return 留言集合
     */
    List<CourseComment> getCommentsByCourseId(Integer courseid, Integer offset, Integer pageSize);
    /**
     * 点赞
     * @param comment_id 留言编号
     * @param userid 用户编号
     * @return 0：保存失败，1：保存成功
     */
    Integer saveFavorite(Integer comment_id, Integer userid);

    /**
     * 取消赞
     * @param comment_id 留言编号
     * @param userid 用户编号
     * @return 0：保存失败，1：保存成功
     */
    Integer cancelFavorite(Integer comment_id, Integer userid);
}
