package com.jd.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForumExample implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }
    
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

	public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

        public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andForumIdIsNull() {
            addCriterion("forum_id is null");
            return (Criteria) this;
        }

        public Criteria andForumIdIsNotNull() {
            addCriterion("forum_id is not null");
            return (Criteria) this;
        }

        public Criteria andForumIdEqualTo(Integer value) {
            addCriterion("forum_id =", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotEqualTo(Integer value) {
            addCriterion("forum_id <>", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThan(Integer value) {
            addCriterion("forum_id >", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("forum_id >=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThan(Integer value) {
            addCriterion("forum_id <", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdLessThanOrEqualTo(Integer value) {
            addCriterion("forum_id <=", value, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdIn(List<Integer> values) {
            addCriterion("forum_id in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotIn(List<Integer> values) {
            addCriterion("forum_id not in", values, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdBetween(Integer value1, Integer value2) {
            addCriterion("forum_id between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andForumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("forum_id not between", value1, value2, "forumId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNull() {
            addCriterion("users_id is null");
            return (Criteria) this;
        }

        public Criteria andUsersIdIsNotNull() {
            addCriterion("users_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsersIdEqualTo(Integer value) {
            addCriterion("users_id =", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotEqualTo(Integer value) {
            addCriterion("users_id <>", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThan(Integer value) {
            addCriterion("users_id >", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("users_id >=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThan(Integer value) {
            addCriterion("users_id <", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdLessThanOrEqualTo(Integer value) {
            addCriterion("users_id <=", value, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdIn(List<Integer> values) {
            addCriterion("users_id in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotIn(List<Integer> values) {
            addCriterion("users_id not in", values, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdBetween(Integer value1, Integer value2) {
            addCriterion("users_id between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andUsersIdNotBetween(Integer value1, Integer value2) {
            addCriterion("users_id not between", value1, value2, "usersId");
            return (Criteria) this;
        }

        public Criteria andForumTimeIsNull() {
            addCriterion("forum_time is null");
            return (Criteria) this;
        }

        public Criteria andForumTimeIsNotNull() {
            addCriterion("forum_time is not null");
            return (Criteria) this;
        }

        public Criteria andForumTimeEqualTo(Date value) {
            addCriterion("forum_time =", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeNotEqualTo(Date value) {
            addCriterion("forum_time <>", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeGreaterThan(Date value) {
            addCriterion("forum_time >", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("forum_time >=", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeLessThan(Date value) {
            addCriterion("forum_time <", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeLessThanOrEqualTo(Date value) {
            addCriterion("forum_time <=", value, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeIn(List<Date> values) {
            addCriterion("forum_time in", values, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeNotIn(List<Date> values) {
            addCriterion("forum_time not in", values, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeBetween(Date value1, Date value2) {
            addCriterion("forum_time between", value1, value2, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumTimeNotBetween(Date value1, Date value2) {
            addCriterion("forum_time not between", value1, value2, "forumTime");
            return (Criteria) this;
        }

        public Criteria andForumImgIsNull() {
            addCriterion("forum_img is null");
            return (Criteria) this;
        }

        public Criteria andForumImgIsNotNull() {
            addCriterion("forum_img is not null");
            return (Criteria) this;
        }

        public Criteria andForumImgEqualTo(String value) {
            addCriterion("forum_img =", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgNotEqualTo(String value) {
            addCriterion("forum_img <>", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgGreaterThan(String value) {
            addCriterion("forum_img >", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgGreaterThanOrEqualTo(String value) {
            addCriterion("forum_img >=", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgLessThan(String value) {
            addCriterion("forum_img <", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgLessThanOrEqualTo(String value) {
            addCriterion("forum_img <=", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgLike(String value) {
            addCriterion("forum_img like", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgNotLike(String value) {
            addCriterion("forum_img not like", value, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgIn(List<String> values) {
            addCriterion("forum_img in", values, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgNotIn(List<String> values) {
            addCriterion("forum_img not in", values, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgBetween(String value1, String value2) {
            addCriterion("forum_img between", value1, value2, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumImgNotBetween(String value1, String value2) {
            addCriterion("forum_img not between", value1, value2, "forumImg");
            return (Criteria) this;
        }

        public Criteria andForumContentIsNull() {
            addCriterion("forum_content is null");
            return (Criteria) this;
        }

        public Criteria andForumContentIsNotNull() {
            addCriterion("forum_content is not null");
            return (Criteria) this;
        }

        public Criteria andForumContentEqualTo(String value) {
            addCriterion("forum_content =", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentNotEqualTo(String value) {
            addCriterion("forum_content <>", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentGreaterThan(String value) {
            addCriterion("forum_content >", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentGreaterThanOrEqualTo(String value) {
            addCriterion("forum_content >=", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentLessThan(String value) {
            addCriterion("forum_content <", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentLessThanOrEqualTo(String value) {
            addCriterion("forum_content <=", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentLike(String value) {
            addCriterion("forum_content like", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentNotLike(String value) {
            addCriterion("forum_content not like", value, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentIn(List<String> values) {
            addCriterion("forum_content in", values, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentNotIn(List<String> values) {
            addCriterion("forum_content not in", values, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentBetween(String value1, String value2) {
            addCriterion("forum_content between", value1, value2, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumContentNotBetween(String value1, String value2) {
            addCriterion("forum_content not between", value1, value2, "forumContent");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsIsNull() {
            addCriterion("forum_pageviews is null");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsIsNotNull() {
            addCriterion("forum_pageviews is not null");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsEqualTo(Integer value) {
            addCriterion("forum_pageviews =", value, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsNotEqualTo(Integer value) {
            addCriterion("forum_pageviews <>", value, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsGreaterThan(Integer value) {
            addCriterion("forum_pageviews >", value, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("forum_pageviews >=", value, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsLessThan(Integer value) {
            addCriterion("forum_pageviews <", value, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsLessThanOrEqualTo(Integer value) {
            addCriterion("forum_pageviews <=", value, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsIn(List<Integer> values) {
            addCriterion("forum_pageviews in", values, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsNotIn(List<Integer> values) {
            addCriterion("forum_pageviews not in", values, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsBetween(Integer value1, Integer value2) {
            addCriterion("forum_pageviews between", value1, value2, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumPageviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("forum_pageviews not between", value1, value2, "forumPageviews");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeIsNull() {
            addCriterion("forum_commentvolume is null");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeIsNotNull() {
            addCriterion("forum_commentvolume is not null");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeEqualTo(Integer value) {
            addCriterion("forum_commentvolume =", value, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeNotEqualTo(Integer value) {
            addCriterion("forum_commentvolume <>", value, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeGreaterThan(Integer value) {
            addCriterion("forum_commentvolume >", value, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("forum_commentvolume >=", value, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeLessThan(Integer value) {
            addCriterion("forum_commentvolume <", value, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("forum_commentvolume <=", value, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeIn(List<Integer> values) {
            addCriterion("forum_commentvolume in", values, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeNotIn(List<Integer> values) {
            addCriterion("forum_commentvolume not in", values, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeBetween(Integer value1, Integer value2) {
            addCriterion("forum_commentvolume between", value1, value2, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumCommentvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("forum_commentvolume not between", value1, value2, "forumCommentvolume");
            return (Criteria) this;
        }

        public Criteria andForumTypeIsNull() {
            addCriterion("forum_type is null");
            return (Criteria) this;
        }

        public Criteria andForumTypeIsNotNull() {
            addCriterion("forum_type is not null");
            return (Criteria) this;
        }

        public Criteria andForumTypeEqualTo(String value) {
            addCriterion("forum_type =", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeNotEqualTo(String value) {
            addCriterion("forum_type <>", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeGreaterThan(String value) {
            addCriterion("forum_type >", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeGreaterThanOrEqualTo(String value) {
            addCriterion("forum_type >=", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeLessThan(String value) {
            addCriterion("forum_type <", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeLessThanOrEqualTo(String value) {
            addCriterion("forum_type <=", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeLike(String value) {
            addCriterion("forum_type like", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeNotLike(String value) {
            addCriterion("forum_type not like", value, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeIn(List<String> values) {
            addCriterion("forum_type in", values, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeNotIn(List<String> values) {
            addCriterion("forum_type not in", values, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeBetween(String value1, String value2) {
            addCriterion("forum_type between", value1, value2, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumTypeNotBetween(String value1, String value2) {
            addCriterion("forum_type not between", value1, value2, "forumType");
            return (Criteria) this;
        }

        public Criteria andForumDescrIsNull() {
            addCriterion("forum_descr is null");
            return (Criteria) this;
        }

        public Criteria andForumDescrIsNotNull() {
            addCriterion("forum_descr is not null");
            return (Criteria) this;
        }

        public Criteria andForumDescrEqualTo(String value) {
            addCriterion("forum_descr =", value, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrNotEqualTo(String value) {
            addCriterion("forum_descr <>", value, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrGreaterThan(String value) {
            addCriterion("forum_descr >", value, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrGreaterThanOrEqualTo(String value) {
            addCriterion("forum_descr >=", value, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrLessThan(String value) {
            addCriterion("forum_descr <", value, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrLessThanOrEqualTo(String value) {
            addCriterion("forum_descr <=", value, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrLike(String value) {
            addCriterion("forum_descr like", value, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrNotLike(String value) {
            addCriterion("forum_descr not like", value, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrIn(List<String> values) {
            addCriterion("forum_descr in", values, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrNotIn(List<String> values) {
            addCriterion("forum_descr not in", values, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrBetween(String value1, String value2) {
            addCriterion("forum_descr between", value1, value2, "forumDescr");
            return (Criteria) this;
        }

        public Criteria andForumDescrNotBetween(String value1, String value2) {
            addCriterion("forum_descr not between", value1, value2, "forumDescr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}