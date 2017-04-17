package com.publiccms.logic.dao.cms;

// Generated 2015-7-10 16:36:23 by com.sanluan.common.source.SourceGenerator

import org.springframework.stereotype.Repository;

import com.publiccms.entities.cms.CmsTagType;
import com.sanluan.common.base.BaseDao;
import com.sanluan.common.handler.PageHandler;
import com.sanluan.common.handler.QueryHandler;

/**
 * 标签类型DAO
 * 
 * CmsTagType DAO
 * 
 */
@Repository
public class CmsTagTypeDao extends BaseDao<CmsTagType> {
    /**
     * 获取标签类型列表
     * 
     * Get tag type list
     * 
     * @param siteId
     * @param name
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public PageHandler getPage(Integer siteId, String name, Integer pageIndex, Integer pageSize) {
        QueryHandler queryHandler = getQueryHandler("from CmsTagType bean");
        if (notEmpty(siteId)) {
            queryHandler.condition("bean.siteId = :siteId").setParameter("siteId", siteId);
        }
        if (notEmpty(name)) {
            queryHandler.condition("bean.name like :name").setParameter("name", rightLike(name));
        }
        queryHandler.order("bean.id desc");
        return getPage(queryHandler, pageIndex, pageSize);
    }

    @Override
    protected CmsTagType init(CmsTagType entity) {
        return entity;
    }

}