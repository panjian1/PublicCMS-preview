package com.publiccms.views.directive.home;

// Generated 2016-11-19 9:58:46 by com.sanluan.common.source.SourceGenerator

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.publiccms.common.base.AbstractTemplateDirective;
import com.publiccms.logic.service.home.HomeGroupService;
import com.sanluan.common.handler.RenderHandler;
import com.sanluan.common.handler.PageHandler;

/**
 *
 * HomeGroupListDirective
 * 
 */
@Component
public class HomeGroupListDirective extends AbstractTemplateDirective {

    @Override
    public void execute(RenderHandler handler) throws IOException, Exception {
        PageHandler page = service.getPage(handler.getInteger("siteId"), handler.getLong("userId"), 
                handler.getString("orderField"), handler.getString("orderType"), handler.getInteger("pageIndex",1), handler.getInteger("count",30));
        handler.put("page", page).render();
    }

    @Autowired
    private HomeGroupService service;

}