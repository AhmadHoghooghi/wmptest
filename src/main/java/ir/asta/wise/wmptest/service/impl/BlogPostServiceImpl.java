package ir.asta.wise.wmptest.service.impl;
import java.util.Map;

import ir.asta.wise.core.crud.*;
import ir.asta.wise.core.datamanagement.*;
import ir.asta.wise.core.remoting.rs.Include;
import ir.asta.wise.core.remoting.rs.Includes;
import ir.asta.wise.core.util.beancopier.Mapper;
import ir.asta.wise.core.util.beancopier.MapperEnabled;

import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;

/*PROTECTED REGION ID(BlogPostServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.BlogPostEntity;
import ir.asta.wise.wmptest.service.BlogPostService;
import ir.asta.wise.wmptest.manager.BlogPostManager;

@Named("blogPostService")
@MapperEnabled
public class BlogPostServiceImpl
		extends
			AbstractCrudService<BlogPostEntity, java.lang.Long>
		implements
			BlogPostService {

	/*PROTECTED REGION ID(BlogPostServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public BlogPostServiceImpl(BlogPostManager manager) {
		super.setManager(manager);
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	public Map<String, Object> searchDefault() {
		return super.searchDefault();
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	public BlogPostEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "label.pk", "label.toStr", "labelStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	public BlogPostEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"label.pk", "label.toStr", "labelStr"}) BlogPostEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.label.toStr"}, enrich = false)
	public DataPage<BlogPostEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(BlogPostServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
