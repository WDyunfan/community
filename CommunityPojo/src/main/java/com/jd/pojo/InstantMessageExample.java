package com.jd.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstantMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstantMessageExample() {
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

        public Criteria andInstantMessageIdIsNull() {
            addCriterion("instant_message_id is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdIsNotNull() {
            addCriterion("instant_message_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdEqualTo(Integer value) {
            addCriterion("instant_message_id =", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdNotEqualTo(Integer value) {
            addCriterion("instant_message_id <>", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdGreaterThan(Integer value) {
            addCriterion("instant_message_id >", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("instant_message_id >=", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdLessThan(Integer value) {
            addCriterion("instant_message_id <", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdLessThanOrEqualTo(Integer value) {
            addCriterion("instant_message_id <=", value, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdIn(List<Integer> values) {
            addCriterion("instant_message_id in", values, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdNotIn(List<Integer> values) {
            addCriterion("instant_message_id not in", values, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdBetween(Integer value1, Integer value2) {
            addCriterion("instant_message_id between", value1, value2, "instantMessageId");
            return (Criteria) this;
        }

        public Criteria andInstantMessageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("instant_message_id not between", value1, value2, "instantMessageId");
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

        public Criteria andInstantMessageTitleIsNull() {
            addCriterion("instant_message_title is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleIsNotNull() {
            addCriterion("instant_message_title is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleEqualTo(String value) {
            addCriterion("instant_message_title =", value, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleNotEqualTo(String value) {
            addCriterion("instant_message_title <>", value, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleGreaterThan(String value) {
            addCriterion("instant_message_title >", value, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("instant_message_title >=", value, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleLessThan(String value) {
            addCriterion("instant_message_title <", value, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("instant_message_title <=", value, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleLike(String value) {
            addCriterion("instant_message_title like", value, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleNotLike(String value) {
            addCriterion("instant_message_title not like", value, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleIn(List<String> values) {
            addCriterion("instant_message_title in", values, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleNotIn(List<String> values) {
            addCriterion("instant_message_title not in", values, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleBetween(String value1, String value2) {
            addCriterion("instant_message_title between", value1, value2, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTitleNotBetween(String value1, String value2) {
            addCriterion("instant_message_title not between", value1, value2, "instantMessageTitle");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentIsNull() {
            addCriterion("instant_message_content is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentIsNotNull() {
            addCriterion("instant_message_content is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentEqualTo(String value) {
            addCriterion("instant_message_content =", value, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentNotEqualTo(String value) {
            addCriterion("instant_message_content <>", value, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentGreaterThan(String value) {
            addCriterion("instant_message_content >", value, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentGreaterThanOrEqualTo(String value) {
            addCriterion("instant_message_content >=", value, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentLessThan(String value) {
            addCriterion("instant_message_content <", value, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentLessThanOrEqualTo(String value) {
            addCriterion("instant_message_content <=", value, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentLike(String value) {
            addCriterion("instant_message_content like", value, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentNotLike(String value) {
            addCriterion("instant_message_content not like", value, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentIn(List<String> values) {
            addCriterion("instant_message_content in", values, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentNotIn(List<String> values) {
            addCriterion("instant_message_content not in", values, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentBetween(String value1, String value2) {
            addCriterion("instant_message_content between", value1, value2, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageContentNotBetween(String value1, String value2) {
            addCriterion("instant_message_content not between", value1, value2, "instantMessageContent");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeIsNull() {
            addCriterion("instant_message_time is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeIsNotNull() {
            addCriterion("instant_message_time is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeEqualTo(Date value) {
            addCriterion("instant_message_time =", value, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeNotEqualTo(Date value) {
            addCriterion("instant_message_time <>", value, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeGreaterThan(Date value) {
            addCriterion("instant_message_time >", value, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("instant_message_time >=", value, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeLessThan(Date value) {
            addCriterion("instant_message_time <", value, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeLessThanOrEqualTo(Date value) {
            addCriterion("instant_message_time <=", value, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeIn(List<Date> values) {
            addCriterion("instant_message_time in", values, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeNotIn(List<Date> values) {
            addCriterion("instant_message_time not in", values, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeBetween(Date value1, Date value2) {
            addCriterion("instant_message_time between", value1, value2, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTimeNotBetween(Date value1, Date value2) {
            addCriterion("instant_message_time not between", value1, value2, "instantMessageTime");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsIsNull() {
            addCriterion("instant_message_pageviews is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsIsNotNull() {
            addCriterion("instant_message_pageviews is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsEqualTo(Integer value) {
            addCriterion("instant_message_pageviews =", value, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsNotEqualTo(Integer value) {
            addCriterion("instant_message_pageviews <>", value, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsGreaterThan(Integer value) {
            addCriterion("instant_message_pageviews >", value, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsGreaterThanOrEqualTo(Integer value) {
            addCriterion("instant_message_pageviews >=", value, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsLessThan(Integer value) {
            addCriterion("instant_message_pageviews <", value, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsLessThanOrEqualTo(Integer value) {
            addCriterion("instant_message_pageviews <=", value, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsIn(List<Integer> values) {
            addCriterion("instant_message_pageviews in", values, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsNotIn(List<Integer> values) {
            addCriterion("instant_message_pageviews not in", values, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsBetween(Integer value1, Integer value2) {
            addCriterion("instant_message_pageviews between", value1, value2, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessagePageviewsNotBetween(Integer value1, Integer value2) {
            addCriterion("instant_message_pageviews not between", value1, value2, "instantMessagePageviews");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeIsNull() {
            addCriterion("instant_message_like is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeIsNotNull() {
            addCriterion("instant_message_like is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeEqualTo(Integer value) {
            addCriterion("instant_message_like =", value, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeNotEqualTo(Integer value) {
            addCriterion("instant_message_like <>", value, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeGreaterThan(Integer value) {
            addCriterion("instant_message_like >", value, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeGreaterThanOrEqualTo(Integer value) {
            addCriterion("instant_message_like >=", value, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeLessThan(Integer value) {
            addCriterion("instant_message_like <", value, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeLessThanOrEqualTo(Integer value) {
            addCriterion("instant_message_like <=", value, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeIn(List<Integer> values) {
            addCriterion("instant_message_like in", values, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeNotIn(List<Integer> values) {
            addCriterion("instant_message_like not in", values, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeBetween(Integer value1, Integer value2) {
            addCriterion("instant_message_like between", value1, value2, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andInstantMessageLikeNotBetween(Integer value1, Integer value2) {
            addCriterion("instant_message_like not between", value1, value2, "instantMessageLike");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeIsNull() {
            addCriterion("intant_message_commentvolume is null");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeIsNotNull() {
            addCriterion("intant_message_commentvolume is not null");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeEqualTo(Integer value) {
            addCriterion("intant_message_commentvolume =", value, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeNotEqualTo(Integer value) {
            addCriterion("intant_message_commentvolume <>", value, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeGreaterThan(Integer value) {
            addCriterion("intant_message_commentvolume >", value, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("intant_message_commentvolume >=", value, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeLessThan(Integer value) {
            addCriterion("intant_message_commentvolume <", value, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeLessThanOrEqualTo(Integer value) {
            addCriterion("intant_message_commentvolume <=", value, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeIn(List<Integer> values) {
            addCriterion("intant_message_commentvolume in", values, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeNotIn(List<Integer> values) {
            addCriterion("intant_message_commentvolume not in", values, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeBetween(Integer value1, Integer value2) {
            addCriterion("intant_message_commentvolume between", value1, value2, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andIntantMessageCommentvolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("intant_message_commentvolume not between", value1, value2, "intantMessageCommentvolume");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeIsNull() {
            addCriterion("instant_message_type is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeIsNotNull() {
            addCriterion("instant_message_type is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeEqualTo(String value) {
            addCriterion("instant_message_type =", value, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeNotEqualTo(String value) {
            addCriterion("instant_message_type <>", value, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeGreaterThan(String value) {
            addCriterion("instant_message_type >", value, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("instant_message_type >=", value, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeLessThan(String value) {
            addCriterion("instant_message_type <", value, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("instant_message_type <=", value, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeLike(String value) {
            addCriterion("instant_message_type like", value, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeNotLike(String value) {
            addCriterion("instant_message_type not like", value, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeIn(List<String> values) {
            addCriterion("instant_message_type in", values, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeNotIn(List<String> values) {
            addCriterion("instant_message_type not in", values, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeBetween(String value1, String value2) {
            addCriterion("instant_message_type between", value1, value2, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageTypeNotBetween(String value1, String value2) {
            addCriterion("instant_message_type not between", value1, value2, "instantMessageType");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrIsNull() {
            addCriterion("instant_message_descr is null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrIsNotNull() {
            addCriterion("instant_message_descr is not null");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrEqualTo(String value) {
            addCriterion("instant_message_descr =", value, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrNotEqualTo(String value) {
            addCriterion("instant_message_descr <>", value, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrGreaterThan(String value) {
            addCriterion("instant_message_descr >", value, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrGreaterThanOrEqualTo(String value) {
            addCriterion("instant_message_descr >=", value, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrLessThan(String value) {
            addCriterion("instant_message_descr <", value, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrLessThanOrEqualTo(String value) {
            addCriterion("instant_message_descr <=", value, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrLike(String value) {
            addCriterion("instant_message_descr like", value, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrNotLike(String value) {
            addCriterion("instant_message_descr not like", value, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrIn(List<String> values) {
            addCriterion("instant_message_descr in", values, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrNotIn(List<String> values) {
            addCriterion("instant_message_descr not in", values, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrBetween(String value1, String value2) {
            addCriterion("instant_message_descr between", value1, value2, "instantMessageDescr");
            return (Criteria) this;
        }

        public Criteria andInstantMessageDescrNotBetween(String value1, String value2) {
            addCriterion("instant_message_descr not between", value1, value2, "instantMessageDescr");
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