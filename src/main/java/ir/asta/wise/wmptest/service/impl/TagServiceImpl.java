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

/*PROTECTED REGION ID(TagServiceImpl Imports) ENABLED START*/

/*PROTECTED REGION END*/

import ir.asta.wise.wmptest.entities.TagEntity;
import ir.asta.wise.wmptest.service.TagService;
import ir.asta.wise.wmptest.manager.TagManager;

@Named("tagService")
@MapperEnabled
public class TagServiceImpl
		extends
			AbstractCrudService<TagEntity, java.lang.Long>
		implements
			TagService {

	/*PROTECTED REGION ID(TagServiceImpl Attributes) ENABLED START*/

	/*PROTECTED REGION END*/

	@Inject
	public TagServiceImpl(TagManager manager) {
		super.setManager(manager);
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	@Include(url = "blogPost/allOptions", responsePath = "options.post", enabled = "${param['options'] != 'false'}")
	public Map<String, Object> searchDefault() {
		return super.searchDefault();
	}

	@Override
	@Mapper(value = "*", enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/permissions", responsePath = "permissions")
	@Include(url = "blogPost/allOptions", responsePath = "options.post", enabled = "${param['options'] != 'false'}")
	public TagEntity load() {
		return super.load();
	}

	@Override
	@Mapper(value = {"*", "post.pk", "post.toStr", "postStr"}, enrich = false)
	@Include(url = "#/enums", responsePath = "enums", enabled = "${param['options'] != 'false'}")
	@Include(url = "#/entityPermissions/${args[0]}", responsePath = "permissions")
	@Include(url = "blogPost/allOptions", responsePath = "options.post", enabled = "${param['options'] != 'false'}")
	public TagEntity load(java.lang.Long id) {
		return super.load(id);
	}

	@Override
	public ActionResult<java.lang.Long> saveOrUpdate(@Mapper(value = {"*",
			"post.pk", "post.toStr", "postStr"}) TagEntity entity) {
		return super.saveOrUpdate(entity);
	}

	@Override
	@Mapper(value = {"*", "items.*", "items.post.toStr"}, enrich = false)
	public DataPage<TagEntity> search(HttpServletRequest request) {
		return super.search(request);
	}

	/*PROTECTED REGION ID(TagServiceImpl Methods) ENABLED START*/

	/*PROTECTED REGION END*/

}
