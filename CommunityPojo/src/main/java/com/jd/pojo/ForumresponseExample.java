package com.jd.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ForumresponseExample implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ForumresponseExample() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
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

        public Criteria andForumresponseIdIsNull() {
            addCriterion("forumresponse_id is null");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdIsNotNull() {
            addCriterion("forumresponse_id is not null");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdEqualTo(Integer value) {
            addCriterion("forumresponse_id =", value, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdNotEqualTo(Integer value) {
            addCriterion("forumresponse_id <>", value, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdGreaterThan(Integer value) {
            addCriterion("forumresponse_id >", value, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("forumresponse_id >=", value, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdLessThan(Integer value) {
            addCriterion("forumresponse_id <", value, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdLessThanOrEqualTo(Integer value) {
            addCriterion("forumresponse_id <=", value, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdIn(List<Integer> values) {
            addCriterion("forumresponse_id in", values, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdNotIn(List<Integer> values) {
            addCriterion("forumresponse_id not in", values, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdBetween(Integer value1, Integer value2) {
            addCriterion("forumresponse_id between", value1, value2, "forumresponseId");
            return (Criteria) this;
        }

        public Criteria andForumresponseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("forumresponse_id not between", value1, value2, "forumresponseId");
            return (Criteria) this;
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

        public Criteria andForumresponseImgIsNull() {
            addCriterion("forumresponse_img is null");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgIsNotNull() {
            addCriterion("forumresponse_img is not null");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgEqualTo(String value) {
            addCriterion("forumresponse_img =", value, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgNotEqualTo(String value) {
            addCriterion("forumresponse_img <>", value, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgGreaterThan(String value) {
            addCriterion("forumresponse_img >", value, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgGreaterThanOrEqualTo(String value) {
            addCriterion("forumresponse_img >=", value, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgLessThan(String value) {
            addCriterion("forumresponse_img <", value, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgLessThanOrEqualTo(String value) {
            addCriterion("forumresponse_img <=", value, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgLike(String value) {
            addCriterion("forumresponse_img like", value, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgNotLike(String value) {
            addCriterion("forumresponse_img not like", value, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgIn(List<String> values) {
            addCriterion("forumresponse_img in", values, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgNotIn(List<String> values) {
            addCriterion("forumresponse_img not in", values, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgBetween(String value1, String value2) {
            addCriterion("forumresponse_img between", value1, value2, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseImgNotBetween(String value1, String value2) {
            addCriterion("forumresponse_img not between", value1, value2, "forumresponseImg");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentIsNull() {
            addCriterion("forumresponse_content is null");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentIsNotNull() {
            addCriterion("forumresponse_content is not null");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentEqualTo(String value) {
            addCriterion("forumresponse_content =", value, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentNotEqualTo(String value) {
            addCriterion("forumresponse_content <>", value, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentGreaterThan(String value) {
            addCriterion("forumresponse_content >", value, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentGreaterThanOrEqualTo(String value) {
            addCriterion("forumresponse_content >=", value, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentLessThan(String value) {
            addCriterion("forumresponse_content <", value, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentLessThanOrEqualTo(String value) {
            addCriterion("forumresponse_content <=", value, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentLike(String value) {
            addCriterion("forumresponse_content like", value, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentNotLike(String value) {
            addCriterion("forumresponse_content not like", value, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentIn(List<String> values) {
            addCriterion("forumresponse_content in", values, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentNotIn(List<String> values) {
            addCriterion("forumresponse_content not in", values, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentBetween(String value1, String value2) {
            addCriterion("forumresponse_content between", value1, value2, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseContentNotBetween(String value1, String value2) {
            addCriterion("forumresponse_content not between", value1, value2, "forumresponseContent");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeIsNull() {
            addCriterion("forumresponse_like is null");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeIsNotNull() {
            addCriterion("forumresponse_like is not null");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeEqualTo(Integer value) {
            addCriterion("forumresponse_like =", value, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeNotEqualTo(Integer value) {
            addCriterion("forumresponse_like <>", value, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeGreaterThan(Integer value) {
            addCriterion("forumresponse_like >", value, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("forumresponse_like >=", value, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeLessThan(Integer value) {
            addCriterion("forumresponse_like <", value, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeLessThanOrEqualTo(Integer value) {
            addCriterion("forumresponse_like <=", value, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeIn(List<Integer> values) {
            addCriterion("forumresponse_like in", values, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeNotIn(List<Integer> values) {
            addCriterion("forumresponse_like not in", values, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeBetween(Integer value1, Integer value2) {
            addCriterion("forumresponse_like between", value1, value2, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("forumresponse_like not between", value1, value2, "forumresponseLike");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeIsNull() {
            addCriterion("forumresponse_time is null");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeIsNotNull() {
            addCriterion("forumresponse_time is not null");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeEqualTo(Date value) {
            addCriterion("forumresponse_time =", value, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeNotEqualTo(Date value) {
            addCriterion("forumresponse_time <>", value, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeGreaterThan(Date value) {
            addCriterion("forumresponse_time >", value, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("forumresponse_time >=", value, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeLessThan(Date value) {
            addCriterion("forumresponse_time <", value, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeLessThanOrEqualTo(Date value) {
            addCriterion("forumresponse_time <=", value, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeIn(List<Date> values) {
            addCriterion("forumresponse_time in", values, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeNotIn(List<Date> values) {
            addCriterion("forumresponse_time not in", values, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeBetween(Date value1, Date value2) {
            addCriterion("forumresponse_time between", value1, value2, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseTimeNotBetween(Date value1, Date value2) {
            addCriterion("forumresponse_time not between", value1, value2, "forumresponseTime");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrIsNull() {
            addCriterion("forumresponse_descr is null");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrIsNotNull() {
            addCriterion("forumresponse_descr is not null");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrEqualTo(String value) {
            addCriterion("forumresponse_descr =", value, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrNotEqualTo(String value) {
            addCriterion("forumresponse_descr <>", value, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrGreaterThan(String value) {
            addCriterion("forumresponse_descr >", value, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrGreaterThanOrEqualTo(String value) {
            addCriterion("forumresponse_descr >=", value, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrLessThan(String value) {
            addCriterion("forumresponse_descr <", value, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrLessThanOrEqualTo(String value) {
            addCriterion("forumresponse_descr <=", value, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrLike(String value) {
            addCriterion("forumresponse_descr like", value, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrNotLike(String value) {
            addCriterion("forumresponse_descr not like", value, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrIn(List<String> values) {
            addCriterion("forumresponse_descr in", values, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrNotIn(List<String> values) {
            addCriterion("forumresponse_descr not in", values, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrBetween(String value1, String value2) {
            addCriterion("forumresponse_descr between", value1, value2, "forumresponseDescr");
            return (Criteria) this;
        }

        public Criteria andForumresponseDescrNotBetween(String value1, String value2) {
            addCriterion("forumresponse_descr not between", value1, value2, "forumresponseDescr");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria implements Serializable {

        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable{
        /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

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