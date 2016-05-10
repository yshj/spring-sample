package org.spring.ysj.sample.model.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public UserCriteria() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("account is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("account is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("account =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("account <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("account >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("account >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("account <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("account <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("account like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("account not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("account in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("account not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("account between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("account not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("pass is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("pass is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("pass =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("pass <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("pass >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("pass >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("pass <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("pass <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("pass like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("pass not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("pass in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("pass not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("pass between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("pass not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andLoginLastipIsNull() {
            addCriterion("login_lastip is null");
            return (Criteria) this;
        }

        public Criteria andLoginLastipIsNotNull() {
            addCriterion("login_lastip is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLastipEqualTo(Integer value) {
            addCriterion("login_lastip =", value, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipNotEqualTo(Integer value) {
            addCriterion("login_lastip <>", value, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipGreaterThan(Integer value) {
            addCriterion("login_lastip >", value, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_lastip >=", value, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipLessThan(Integer value) {
            addCriterion("login_lastip <", value, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipLessThanOrEqualTo(Integer value) {
            addCriterion("login_lastip <=", value, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipIn(List<Integer> values) {
            addCriterion("login_lastip in", values, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipNotIn(List<Integer> values) {
            addCriterion("login_lastip not in", values, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipBetween(Integer value1, Integer value2) {
            addCriterion("login_lastip between", value1, value2, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginLastipNotBetween(Integer value1, Integer value2) {
            addCriterion("login_lastip not between", value1, value2, "loginLastip");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNull() {
            addCriterion("login_count is null");
            return (Criteria) this;
        }

        public Criteria andLoginCountIsNotNull() {
            addCriterion("login_count is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCountEqualTo(Integer value) {
            addCriterion("login_count =", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotEqualTo(Integer value) {
            addCriterion("login_count <>", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThan(Integer value) {
            addCriterion("login_count >", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_count >=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThan(Integer value) {
            addCriterion("login_count <", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountLessThanOrEqualTo(Integer value) {
            addCriterion("login_count <=", value, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountIn(List<Integer> values) {
            addCriterion("login_count in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotIn(List<Integer> values) {
            addCriterion("login_count not in", values, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountBetween(Integer value1, Integer value2) {
            addCriterion("login_count between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginCountNotBetween(Integer value1, Integer value2) {
            addCriterion("login_count not between", value1, value2, "loginCount");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeIsNull() {
            addCriterion("login_lasttime is null");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeIsNotNull() {
            addCriterion("login_lasttime is not null");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeEqualTo(Date value) {
            addCriterion("login_lasttime =", value, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeNotEqualTo(Date value) {
            addCriterion("login_lasttime <>", value, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeGreaterThan(Date value) {
            addCriterion("login_lasttime >", value, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("login_lasttime >=", value, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeLessThan(Date value) {
            addCriterion("login_lasttime <", value, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeLessThanOrEqualTo(Date value) {
            addCriterion("login_lasttime <=", value, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeIn(List<Date> values) {
            addCriterion("login_lasttime in", values, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeNotIn(List<Date> values) {
            addCriterion("login_lasttime not in", values, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeBetween(Date value1, Date value2) {
            addCriterion("login_lasttime between", value1, value2, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andLoginLasttimeNotBetween(Date value1, Date value2) {
            addCriterion("login_lasttime not between", value1, value2, "loginLasttime");
            return (Criteria) this;
        }

        public Criteria andParent1IsNull() {
            addCriterion("parent1 is null");
            return (Criteria) this;
        }

        public Criteria andParent1IsNotNull() {
            addCriterion("parent1 is not null");
            return (Criteria) this;
        }

        public Criteria andParent1EqualTo(Integer value) {
            addCriterion("parent1 =", value, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1NotEqualTo(Integer value) {
            addCriterion("parent1 <>", value, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1GreaterThan(Integer value) {
            addCriterion("parent1 >", value, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1GreaterThanOrEqualTo(Integer value) {
            addCriterion("parent1 >=", value, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1LessThan(Integer value) {
            addCriterion("parent1 <", value, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1LessThanOrEqualTo(Integer value) {
            addCriterion("parent1 <=", value, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1In(List<Integer> values) {
            addCriterion("parent1 in", values, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1NotIn(List<Integer> values) {
            addCriterion("parent1 not in", values, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1Between(Integer value1, Integer value2) {
            addCriterion("parent1 between", value1, value2, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent1NotBetween(Integer value1, Integer value2) {
            addCriterion("parent1 not between", value1, value2, "parent1");
            return (Criteria) this;
        }

        public Criteria andParent2IsNull() {
            addCriterion("parent2 is null");
            return (Criteria) this;
        }

        public Criteria andParent2IsNotNull() {
            addCriterion("parent2 is not null");
            return (Criteria) this;
        }

        public Criteria andParent2EqualTo(Integer value) {
            addCriterion("parent2 =", value, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2NotEqualTo(Integer value) {
            addCriterion("parent2 <>", value, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2GreaterThan(Integer value) {
            addCriterion("parent2 >", value, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2GreaterThanOrEqualTo(Integer value) {
            addCriterion("parent2 >=", value, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2LessThan(Integer value) {
            addCriterion("parent2 <", value, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2LessThanOrEqualTo(Integer value) {
            addCriterion("parent2 <=", value, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2In(List<Integer> values) {
            addCriterion("parent2 in", values, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2NotIn(List<Integer> values) {
            addCriterion("parent2 not in", values, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2Between(Integer value1, Integer value2) {
            addCriterion("parent2 between", value1, value2, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent2NotBetween(Integer value1, Integer value2) {
            addCriterion("parent2 not between", value1, value2, "parent2");
            return (Criteria) this;
        }

        public Criteria andParent3IsNull() {
            addCriterion("parent3 is null");
            return (Criteria) this;
        }

        public Criteria andParent3IsNotNull() {
            addCriterion("parent3 is not null");
            return (Criteria) this;
        }

        public Criteria andParent3EqualTo(Integer value) {
            addCriterion("parent3 =", value, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3NotEqualTo(Integer value) {
            addCriterion("parent3 <>", value, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3GreaterThan(Integer value) {
            addCriterion("parent3 >", value, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3GreaterThanOrEqualTo(Integer value) {
            addCriterion("parent3 >=", value, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3LessThan(Integer value) {
            addCriterion("parent3 <", value, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3LessThanOrEqualTo(Integer value) {
            addCriterion("parent3 <=", value, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3In(List<Integer> values) {
            addCriterion("parent3 in", values, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3NotIn(List<Integer> values) {
            addCriterion("parent3 not in", values, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3Between(Integer value1, Integer value2) {
            addCriterion("parent3 between", value1, value2, "parent3");
            return (Criteria) this;
        }

        public Criteria andParent3NotBetween(Integer value1, Integer value2) {
            addCriterion("parent3 not between", value1, value2, "parent3");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIsNull() {
            addCriterion("is_partner is null");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIsNotNull() {
            addCriterion("is_partner is not null");
            return (Criteria) this;
        }

        public Criteria andIsPartnerEqualTo(Byte value) {
            addCriterion("is_partner =", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotEqualTo(Byte value) {
            addCriterion("is_partner <>", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerGreaterThan(Byte value) {
            addCriterion("is_partner >", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_partner >=", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerLessThan(Byte value) {
            addCriterion("is_partner <", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerLessThanOrEqualTo(Byte value) {
            addCriterion("is_partner <=", value, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerIn(List<Byte> values) {
            addCriterion("is_partner in", values, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotIn(List<Byte> values) {
            addCriterion("is_partner not in", values, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerBetween(Byte value1, Byte value2) {
            addCriterion("is_partner between", value1, value2, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsPartnerNotBetween(Byte value1, Byte value2) {
            addCriterion("is_partner not between", value1, value2, "isPartner");
            return (Criteria) this;
        }

        public Criteria andIsAgentIsNull() {
            addCriterion("is_agent is null");
            return (Criteria) this;
        }

        public Criteria andIsAgentIsNotNull() {
            addCriterion("is_agent is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgentEqualTo(Byte value) {
            addCriterion("is_agent =", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotEqualTo(Byte value) {
            addCriterion("is_agent <>", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentGreaterThan(Byte value) {
            addCriterion("is_agent >", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_agent >=", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLessThan(Byte value) {
            addCriterion("is_agent <", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentLessThanOrEqualTo(Byte value) {
            addCriterion("is_agent <=", value, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentIn(List<Byte> values) {
            addCriterion("is_agent in", values, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotIn(List<Byte> values) {
            addCriterion("is_agent not in", values, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentBetween(Byte value1, Byte value2) {
            addCriterion("is_agent between", value1, value2, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsAgentNotBetween(Byte value1, Byte value2) {
            addCriterion("is_agent not between", value1, value2, "isAgent");
            return (Criteria) this;
        }

        public Criteria andIsMemberIsNull() {
            addCriterion("is_member is null");
            return (Criteria) this;
        }

        public Criteria andIsMemberIsNotNull() {
            addCriterion("is_member is not null");
            return (Criteria) this;
        }

        public Criteria andIsMemberEqualTo(Byte value) {
            addCriterion("is_member =", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberNotEqualTo(Byte value) {
            addCriterion("is_member <>", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberGreaterThan(Byte value) {
            addCriterion("is_member >", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_member >=", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberLessThan(Byte value) {
            addCriterion("is_member <", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberLessThanOrEqualTo(Byte value) {
            addCriterion("is_member <=", value, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberIn(List<Byte> values) {
            addCriterion("is_member in", values, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberNotIn(List<Byte> values) {
            addCriterion("is_member not in", values, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberBetween(Byte value1, Byte value2) {
            addCriterion("is_member between", value1, value2, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsMemberNotBetween(Byte value1, Byte value2) {
            addCriterion("is_member not between", value1, value2, "isMember");
            return (Criteria) this;
        }

        public Criteria andIsServiceIsNull() {
            addCriterion("is_service is null");
            return (Criteria) this;
        }

        public Criteria andIsServiceIsNotNull() {
            addCriterion("is_service is not null");
            return (Criteria) this;
        }

        public Criteria andIsServiceEqualTo(Byte value) {
            addCriterion("is_service =", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotEqualTo(Byte value) {
            addCriterion("is_service <>", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceGreaterThan(Byte value) {
            addCriterion("is_service >", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_service >=", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceLessThan(Byte value) {
            addCriterion("is_service <", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceLessThanOrEqualTo(Byte value) {
            addCriterion("is_service <=", value, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceIn(List<Byte> values) {
            addCriterion("is_service in", values, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotIn(List<Byte> values) {
            addCriterion("is_service not in", values, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceBetween(Byte value1, Byte value2) {
            addCriterion("is_service between", value1, value2, "isService");
            return (Criteria) this;
        }

        public Criteria andIsServiceNotBetween(Byte value1, Byte value2) {
            addCriterion("is_service not between", value1, value2, "isService");
            return (Criteria) this;
        }

        public Criteria andWithPartnerIsNull() {
            addCriterion("with_partner is null");
            return (Criteria) this;
        }

        public Criteria andWithPartnerIsNotNull() {
            addCriterion("with_partner is not null");
            return (Criteria) this;
        }

        public Criteria andWithPartnerEqualTo(Integer value) {
            addCriterion("with_partner =", value, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerNotEqualTo(Integer value) {
            addCriterion("with_partner <>", value, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerGreaterThan(Integer value) {
            addCriterion("with_partner >", value, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("with_partner >=", value, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerLessThan(Integer value) {
            addCriterion("with_partner <", value, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerLessThanOrEqualTo(Integer value) {
            addCriterion("with_partner <=", value, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerIn(List<Integer> values) {
            addCriterion("with_partner in", values, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerNotIn(List<Integer> values) {
            addCriterion("with_partner not in", values, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerBetween(Integer value1, Integer value2) {
            addCriterion("with_partner between", value1, value2, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithPartnerNotBetween(Integer value1, Integer value2) {
            addCriterion("with_partner not between", value1, value2, "withPartner");
            return (Criteria) this;
        }

        public Criteria andWithAgentIsNull() {
            addCriterion("with_agent is null");
            return (Criteria) this;
        }

        public Criteria andWithAgentIsNotNull() {
            addCriterion("with_agent is not null");
            return (Criteria) this;
        }

        public Criteria andWithAgentEqualTo(Integer value) {
            addCriterion("with_agent =", value, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentNotEqualTo(Integer value) {
            addCriterion("with_agent <>", value, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentGreaterThan(Integer value) {
            addCriterion("with_agent >", value, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentGreaterThanOrEqualTo(Integer value) {
            addCriterion("with_agent >=", value, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentLessThan(Integer value) {
            addCriterion("with_agent <", value, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentLessThanOrEqualTo(Integer value) {
            addCriterion("with_agent <=", value, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentIn(List<Integer> values) {
            addCriterion("with_agent in", values, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentNotIn(List<Integer> values) {
            addCriterion("with_agent not in", values, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentBetween(Integer value1, Integer value2) {
            addCriterion("with_agent between", value1, value2, "withAgent");
            return (Criteria) this;
        }

        public Criteria andWithAgentNotBetween(Integer value1, Integer value2) {
            addCriterion("with_agent not between", value1, value2, "withAgent");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMemberTimeIsNull() {
            addCriterion("member_time is null");
            return (Criteria) this;
        }

        public Criteria andMemberTimeIsNotNull() {
            addCriterion("member_time is not null");
            return (Criteria) this;
        }

        public Criteria andMemberTimeEqualTo(Date value) {
            addCriterion("member_time =", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeNotEqualTo(Date value) {
            addCriterion("member_time <>", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeGreaterThan(Date value) {
            addCriterion("member_time >", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("member_time >=", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeLessThan(Date value) {
            addCriterion("member_time <", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeLessThanOrEqualTo(Date value) {
            addCriterion("member_time <=", value, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeIn(List<Date> values) {
            addCriterion("member_time in", values, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeNotIn(List<Date> values) {
            addCriterion("member_time not in", values, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeBetween(Date value1, Date value2) {
            addCriterion("member_time between", value1, value2, "memberTime");
            return (Criteria) this;
        }

        public Criteria andMemberTimeNotBetween(Date value1, Date value2) {
            addCriterion("member_time not between", value1, value2, "memberTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNull() {
            addCriterion("expire_time is null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIsNotNull() {
            addCriterion("expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpireTimeEqualTo(Date value) {
            addCriterion("expire_time =", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotEqualTo(Date value) {
            addCriterion("expire_time <>", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThan(Date value) {
            addCriterion("expire_time >", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_time >=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThan(Date value) {
            addCriterion("expire_time <", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("expire_time <=", value, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeIn(List<Date> values) {
            addCriterion("expire_time in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotIn(List<Date> values) {
            addCriterion("expire_time not in", values, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeBetween(Date value1, Date value2) {
            addCriterion("expire_time between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("expire_time not between", value1, value2, "expireTime");
            return (Criteria) this;
        }

        public Criteria andSrcIsNull() {
            addCriterion("src is null");
            return (Criteria) this;
        }

        public Criteria andSrcIsNotNull() {
            addCriterion("src is not null");
            return (Criteria) this;
        }

        public Criteria andSrcEqualTo(String value) {
            addCriterion("src =", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotEqualTo(String value) {
            addCriterion("src <>", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThan(String value) {
            addCriterion("src >", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcGreaterThanOrEqualTo(String value) {
            addCriterion("src >=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThan(String value) {
            addCriterion("src <", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLessThanOrEqualTo(String value) {
            addCriterion("src <=", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcLike(String value) {
            addCriterion("src like", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotLike(String value) {
            addCriterion("src not like", value, "src");
            return (Criteria) this;
        }

        public Criteria andSrcIn(List<String> values) {
            addCriterion("src in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotIn(List<String> values) {
            addCriterion("src not in", values, "src");
            return (Criteria) this;
        }

        public Criteria andSrcBetween(String value1, String value2) {
            addCriterion("src between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andSrcNotBetween(String value1, String value2) {
            addCriterion("src not between", value1, value2, "src");
            return (Criteria) this;
        }

        public Criteria andAccountLikeInsensitive(String value) {
            addCriterion("upper(account) like", value.toUpperCase(), "account");
            return (Criteria) this;
        }

        public Criteria andNameLikeInsensitive(String value) {
            addCriterion("upper(name) like", value.toUpperCase(), "name");
            return (Criteria) this;
        }

        public Criteria andPassLikeInsensitive(String value) {
            addCriterion("upper(pass) like", value.toUpperCase(), "pass");
            return (Criteria) this;
        }

        public Criteria andSrcLikeInsensitive(String value) {
            addCriterion("upper(src) like", value.toUpperCase(), "src");
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