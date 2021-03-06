/*
 * Symphony - A modern community (forum/SNS/blog) platform written in Java.
 * Copyright (C) 2012-2016,  b3log.org & hacpai.com
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.b3log.symphony.model;

/**
 * This class defines all permission model relevant keys.
 *
 * See <a href="https://github.com/b3log/symphony/issues/337">#337</a> for more details.
 *
 * @author <a href="http://88250.b3log.org">Liang Ding</a>
 * @version 1.0.1.0, Dec 7, 2016
 * @since 1.8.0
 */
public final class Permission {

    /**
     * Permission.
     */
    public static final String PERMISSION = "permission";

    /**
     * Permissions.
     */
    public static final String PERMISSIONS = "permissions";

    /**
     * Key of permission category.
     */
    public static final String PERMISSION_CATEGORY = "permissionCategory";

    /**
     * Key of permission id.
     */
    public static final String PERMISSION_ID = "permissionId";

    /**
     * Key of permission categories.
     */
    public static final String PERMISSION_T_CATEGORIES = "permissionCategories";

    /**
     * Key of permission label.
     */
    public static final String PERMISSION_T_LABEL = "permissionLabel";

    // oId constants
    /**
     * Id - common - add article.
     */
    public static final String PERMISSION_ID_C_COMMON_ADD_ARTICLE = "commonAddArticle";

    /**
     * Id - common - add article.
     */
    public static final String PERMISSION_ID_C_COMMON_ADD_COMMENT = "commonAddComment";

    /**
     * Id - common - stick article.
     */
    public static final String PERMISSION_ID_C_COMMON_STICK_ARTICLE = "commonStickArticle";

    /**
     * Id - common - thank article.
     */
    public static final String PERMISSION_ID_C_COMMON_THANK_ARTICLE = "commonThankArticle";

    /**
     * Id - common - good article.
     */
    public static final String PERMISSION_ID_C_COMMON_GOOD_ARTICLE = "commonGoodArticle";

    /**
     * Id - common - bad article.
     */
    public static final String PERMISSION_ID_C_COMMON_BAD_ARTICLE = "commonBadArticle";

    /**
     * Id - common - follow article.
     */
    public static final String PERMISSION_ID_C_COMMON_FOLLOW_ARTICLE = "commonFollowArticle";

    /**
     * Id - common - view article history.
     */
    public static final String PERMISSION_ID_C_COMMON_VIEW_ARTICLE_HISTORY = "commonViewArticleHistory";

    /**
     * Id - common - thank comment.
     */
    public static final String PERMISSION_ID_C_COMMON_THANK_COMMENT = "commonThankComment";

    /**
     * Id - common - good comment.
     */
    public static final String PERMISSION_ID_C_COMMON_GOOD_COMMENT = "commonGoodComment";

    /**
     * Id - common - bad comment.
     */
    public static final String PERMISSION_ID_C_COMMON_BAD_COMMENT = "commonBadComment";

    /**
     * Id - common - at user.
     */
    public static final String PERMISSION_ID_C_COMMON_AT_USER = "commonAtUser";

    /**
     * Id - common - exchange invitation code.
     */
    public static final String PERMISSION_ID_C_COMMON_EXCHANGE_INVITATION_CODE = "commonExchangeIC";

    /**
     * Id - common - use invitation link.
     */
    public static final String PERMISSION_ID_C_COMMON_USE_INVITATION_LINK = "commonUseIL";

    /**
     * Id - user - add user.
     */
    public static final String PERMISSION_ID_C_USER_ADD_USER = "userAddUser";

    /**
     * Id - user - update user basic data.
     */
    public static final String PERMISSION_ID_C_USER_UPDATE_USER_BASIC = "userUpdateUserBasic";

    /**
     * Id - user - update user advanced data.
     */
    public static final String PERMISSION_ID_C_USER_UPDATE_USER_ADVANCED = "userUpdateUserAdvanced";

    /**
     * Id - user - add point.
     */
    public static final String PERMISSION_ID_C_USER_ADD_POINT = "userAddPoint";

    /**
     * Id - user - exchange point.
     */
    public static final String PERMISSION_ID_C_USER_EXCHANGE_POINT = "userExchangePoint";

    /**
     * Id - user - deduct point.
     */
    public static final String PERMISSION_ID_C_USER_DEDUCT_POINT = "userDeductPoint";

    /**
     * Id - article - update article basic.
     */
    public static final String PERMISSION_ID_C_ARTICLE_UPDATE_ARTICLE_BASIC = "articleUpdateArticleBasic";

    /**
     * Id - article - stick article.
     */
    public static final String PERMISSION_ID_C_ARTICLE_STICK_ARTICLE = "articleStickArticle";

    /**
     * Id - article - cancel stick article.
     */
    public static final String PERMISSION_ID_C_ARTICLE_CANCEL_STICK_ARTICLE = "articleCancelStickArticle";

    /**
     * Id - article - rebuild article index.
     */
    public static final String PERMISSION_ID_C_ARTICLE_REINDEX_ARTICLE_INDEX = "articleReindexArticle";

    /**
     * Id - article - remove article.
     */
    public static final String PERMISSION_ID_C_ARTICLE_REMOVE_ARTICLE = "articleRemoveArticle";

    /**
     * Id - comment - update comment basic.
     */
    public static final String PERMISSION_ID_C_COMMENT_UPDATE_COMMENT_BASIC = "commentUpdateCommentBasic";

    /**
     * Id - comment - remove comment.
     */
    public static final String PERMISSION_ID_C_COMMENT_REMOVE_COMMENT = "commentRemoveComment";

    /**
     * Id - domain - add domain.
     */
    public static final String PERMISSION_ID_C_DOMAIN_ADD_DOMAIN = "domainAddDomain";

    /**
     * Id - domain - add domain tag.
     */
    public static final String PERMISSION_ID_C_DOMAIN_ADD_DOMAIN_TAG = "domainAddDomainTag";

    /**
     * Id - domain - remove domain tag.
     */
    public static final String PERMISSION_ID_C_DOMAIN_REMOVE_DOMAIN_TAG = "domainRemoveDomainTag";

    /**
     * Id - domain - update domain basic.
     */
    public static final String PERMISSION_ID_C_DOMAIN_UPDATE_DOMAIN_BASIC = "domainUpdateDomainBasic";

    /**
     * Id - domain - remove domain.
     */
    public static final String PERMISSION_ID_C_DOMAIN_REMOVE_DOMAIN = "domainRemoveDomain";

    /**
     * Id - tag - update tag basic.
     */
    public static final String PERMISSION_ID_C_TAG_UPDATE_TAG_BASIC = "tagUpdateTagBasic";

    /**
     * Id - reserved word - add reserved word.
     */
    public static final String PERMISSION_ID_C_RW_ADD_RW = "rwAddReservedWord";

    /**
     * Id - reserved word - update reserved word basic.
     */
    public static final String PERMISSION_ID_C_RW_UPDATE_RW_BASIC = "rwUpdateReservedWordBasic";

    /**
     * Id - reserved word - remove reserved word.
     */
    public static final String PERMISSION_ID_C_RW_REMOVE_RW = "rwRemoveReservedWord";

    /**
     * Id - invitation code - generate ic.
     */
    public static final String PERMISSION_ID_C_IC_GEN_IC = "icGenIC";

    /**
     * Id - invitation code - update ic basic.
     */
    public static final String PERMISSION_ID_C_IC_UPDATE_IC_BASIC = "icUpdateICBasic";

    /**
     * Id - advertise - update side.
     */
    public static final String PERMISSION_ID_C_AD_UPDATE_SIDE = "adUpdateADSide";

    /**
     * Id - misc - allow add article.
     */
    public static final String PERMISSION_ID_C_MISC_ALLOW_ADD_ARTICLE = "miscAllowAddArticle";

    /**
     * Id - misc - allow add comment.
     */
    public static final String PERMISSION_ID_C_MISC_ALLOW_ADD_COMMENT = "miscAllowAddComment";

    /**
     * Id - misc - allow anonymous view.
     */
    public static final String PERMISSION_ID_C_MISC_ALLOW_ANONYMOUS_VIEW = "miscAllowAnonymousView";

    /**
     * Id - misc - change register method.
     */
    public static final String PERMISSION_ID_C_MISC_REGISTER_METHOD = "miscRegisterMethod";

    /**
     * Id - misc - change language.
     */
    public static final String PERMISSION_ID_C_MISC_LANGUAGE = "miscLanguage";

    // Category constants
    /**
     * Category - common function.
     */
    public static final int PERMISSION_CATEGORY_C_COMMON = 0;

    /**
     * Category - user management.
     */
    public static final int PERMISSION_CATEGORY_C_USER = 1;

    /**
     * Category - article management.
     */
    public static final int PERMISSION_CATEGORY_C_ARTICLE = 2;

    /**
     * Category - comment management.
     */
    public static final int PERMISSION_CATEGORY_C_COMMENT = 3;

    /**
     * Category - domain management.
     */
    public static final int PERMISSION_CATEGORY_C_DOMAIN = 4;

    /**
     * Category - tag management.
     */
    public static final int PERMISSION_CATEGORY_C_TAG = 5;

    /**
     * Category - reserved word management.
     */
    public static final int PERMISSION_CATEGORY_C_RESERVED_WORD = 6;

    /**
     * Category - invitecode management.
     */
    public static final int PERMISSION_CATEGORY_C_IC = 7;

    /**
     * Category - advertise management.
     */
    public static final int PERMISSION_CATEGORY_C_AD = 8;

    /**
     * Category - misc management.
     */
    public static final int PERMISSION_CATEGORY_C_MISC = 9;

    /**
     * Private constructor.
     */
    private Permission() {
    }
}
