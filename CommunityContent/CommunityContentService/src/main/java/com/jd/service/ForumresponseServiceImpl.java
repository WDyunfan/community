package com.jd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.dao.ForumresponseMapper;
import com.jd.pojo.Forumresponse;
import com.jd.pojo.ForumresponseExample;

@Service
public class ForumresponseServiceImpl implements ForumresponseService {

	@Autowired
	private ForumresponseMapper forumresponseMapper;

	@Override
	public int countByExample(ForumresponseExample example) {
		return forumresponseMapper.countByExample(example);
	}

	@Override
	public boolean deleteByExample(ForumresponseExample example) {
		return forumresponseMapper.deleteByExample(example) > 0;
	}

	@Override
	public boolean deleteByPrimaryKey(Integer forumresponseId) {
		return forumresponseMapper.deleteByPrimaryKey(forumresponseId) > 0;
	}

	@Override
	public boolean insert(Forumresponse record) {
		return forumresponseMapper.insert(record) > 0;
	}

	@Override
	public boolean insertSelective(Forumresponse record) {
		return forumresponseMapper.insertSelective(record) > 0;
	}

	@Override
	public List<Forumresponse> selectByExample(ForumresponseExample example) {
		return forumresponseMapper.selectByExample(example);
	}

	@Override
	public Forumresponse selectByPrimaryKey(Integer forumresponseId) {
		return forumresponseMapper.selectByPrimaryKey(forumresponseId);
	}

	@Override
	public boolean updateByExampleSelective(Forumresponse record, ForumresponseExample example) {
		return forumresponseMapper.updateByExampleSelective(record, example) > 0;
	}

	@Override
	public boolean updateByExample(Forumresponse record, ForumresponseExample example) {
		return forumresponseMapper.updateByExample(record, example) > 0;
	}

	@Override
	public boolean updateByPrimaryKeySelective(Forumresponse record) {
		return forumresponseMapper.updateByPrimaryKeySelective(record) > 0;
	}

	@Override
	public boolean updateByPrimaryKey(Forumresponse record) {
		return forumresponseMapper.updateByPrimaryKey(record) > 0;
	}

}
