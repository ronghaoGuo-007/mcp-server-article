package com.yupi.mcp.mcpserver.dto;

import lombok.Data;

/**
 * 文件发布请求
 *
 * @author gulihua
 * @date 2025-04-10 20:59
 */
@Data
public class ArticlePublishRequest {

    /**
     * 文章ID：传入则更新已有文章/草稿，不传则新建
     */
    private Long id;
    private String title;
    private String description;
    private String content;
    /**
     * 文章标签，多个用英文逗号分隔，如 "人工智能,Java"；为空时默认"后端"
     */
    private String tags;
    /**
     * 分类专栏，多个用英文逗号分隔，如 "Java基础"；为空则不归类
     */
    private String categories;
    /**
     * 是否仅保存为草稿：true=存草稿箱（默认），false=直接发布
     */
    private Boolean draft;
    /**
     * 试运行：true=只返回将要发送的请求体，不真正调用接口
     */
    private Boolean dryRun;
}
