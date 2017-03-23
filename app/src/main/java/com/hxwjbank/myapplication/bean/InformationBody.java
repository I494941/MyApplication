package com.hxwjbank.myapplication.bean;

import java.util.List;

public class InformationBody extends baseBean {

    /**
     * code : 1
     * message : success
     * result : {"items":[{"author":"达尔文","body":"之前，Dimitri John Ledkov 在 Ubuntu 邮件列表 发送了一则消息，称将在 Ubuntu 18.10 中取消 32 位支持。他说越来越多的软件已经有了 64 位支持...","commentCount":16,"href":"https://www.oschina.net/news/78106/ubuntu-32-bit-support-drop","id":78106,"pubDate":"2016-10-16 08:50:47","recommend":true,"title":"Canonical 正考虑移除 Ubuntu 的 32 位支持","type":6,"viewCount":1449},{"author":"局长","body":"10秒总结全文：Cartographer是谷歌刚刚开源的使用激光雷达进行2D/3D SLAM的算法库。其算法本身未必拔萃，但从设计到实现都是产品级的，很可能会在S...","commentCount":4,"href":"https://www.oschina.net/news/78105/what-about-google-slam","id":78105,"pubDate":"2016-10-16 08:22:37","recommend":true,"title":"谷歌近期开源的 SLAM 方案在下一盘怎样的大棋？","type":6,"viewCount":1393},{"author":"达尔文","body":"GitHub 是如今所有开源事物的中央仓库, 这个网站最近发布了一个叫做《2016 Octoverse  状态报告》，详细列出了从去年起其一系列亮点, 包括总的活跃...","commentCount":4,"href":"https://www.oschina.net/translate/10-free-open-source-windows-tools-hosted-github","id":10003573,"pubDate":"2016-10-16 08:19:46","recommend":true,"title":"协作翻译 | GitHub 上10款免费开源 Windows 工具","type":4,"viewCount":2246},{"author":"达尔文","body":"听说三星停产Note7了，为什么呢？大概是生产线炸了吧。听说三星停售 Note7 了，为什么呢？可能是仓库炸了吧？听说三星开始召回 Note7 了，你退货了...","commentCount":20,"href":"https://my.oschina.net/xxiaobian/blog/759034","id":759034,"pubDate":"2016-10-16 08:17:27","recommend":true,"title":"OSChina 周日乱弹 \u2014\u2014 换妻，三星的体贴关怀","type":3,"viewCount":1803},{"author":"达尔文","body":"本文是使用 slf4j + log4j2 示例，由于 slf4j 只是一个统一接口包，log4j / log4j2 / logback 等都是有其实现类，所以本文中是以 slf4j 为例。若有...","commentCount":8,"href":"https://my.oschina.net/yzChen/blog/758984","id":758984,"pubDate":"2016-10-16 08:14:17","recommend":true,"title":"每日一博｜log4j2 之简化封装，告别静态成员变量","type":3,"viewCount":1097},{"author":"达尔文","body":"Fisplay 是客制化、简洁的看板管理展示工具。管理模块使用C#编写，展示模块使用html+php+css+js编写，数据库使用mysql。可以自定义展示的字段名称、...","commentCount":0,"href":"https://git.oschina.net/famio/Fisplay","id":78101,"pubDate":"2016-10-16 08:12:30","recommend":false,"title":"Git 项目推荐 | 自定义演示播放工具 Fisplay","type":0,"viewCount":6},{"author":"达尔文","body":"Tesseract.js 一个几乎能识别出图片中所有语言的JS库。","commentCount":3,"href":"https://www.oschina.net/p/tesseract-js","id":43621,"pubDate":"2016-10-16 08:08:26","recommend":false,"title":"Tesseract.js \u2014\u2014 识别图片语言的 JS 库 ","type":1,"viewCount":1070},{"author":"达尔文","body":"几个星期前，以色列针对iOS开发的\u201cPegasus\u201d间谍软件曝光，它使用三个被称为\u201cTrident\u201d的零日漏洞来攻击目标iOS设备，并且窃取其中信息。苹果立即...","commentCount":6,"href":"https://www.oschina.net/news/78099/ios-android","id":78099,"pubDate":"2016-10-16 08:00:46","recommend":false,"title":"微软高管：iOS 和 Android 一样脆弱","type":6,"viewCount":1271},{"author":"达尔文","body":"尽管当前闭源软件还大有作为，但计算行业正朝着开源的未来行进着。以微软、苹果和Facebook为代表的大企业，均对开源社区做出了大量的贡献，而Googl...","commentCount":1,"href":"https://www.oschina.net/news/78098/google-open-source-blog","id":78098,"pubDate":"2016-10-16 07:54:10","recommend":false,"title":"Google 公布首份\u201c开源成绩单\u201d","type":6,"viewCount":1430},{"author":"局长","body":"HHVM-3.12.10 和 HHVM-3.15.2 发布了，HipHop VM(HHVM)是 Facebook 推出的用来执行 PHP 代码的虚拟机，它是一个 PHP 的 JIT（Just-In- Time）编译器...","commentCount":2,"href":"https://www.oschina.net/news/78097/hvvm-3-12-10-and-3-15-2","id":78097,"pubDate":"2016-10-16 07:46:30","recommend":false,"title":"HHVM-3.12.10 和 HHVM-3.15.2 发布","type":6,"viewCount":711},{"author":"达尔文","body":"代码量算 KPI \u2026\u2026跟程序员们来这套？来自程序员\u2014\u2014这种神秘人类的囧事。","commentCount":21,"href":"https://www.oschina.net/news/78096/code-kpi","id":78096,"pubDate":"2016-10-16 07:42:41","recommend":false,"title":"拿代码量算 KPI \u2026\u2026跟程序员们来这套？","type":6,"viewCount":1636},{"author":"局长","body":"Node.js v6.8.1 (Current) 发布了。Node.js 是一套用来编写高性能网络服务器的 JavaScript 工具包，本次值得关注的更新如下： build: Fix buildin...","commentCount":3,"href":"https://www.oschina.net/news/78095/node-js-6-8-1","id":78095,"pubDate":"2016-10-16 07:36:07","recommend":false,"title":"Node.js v6.8.1 (Current) 发布，多个重要更新","type":6,"viewCount":708},{"author":"局长","body":"Github Atom 1.12.0-beta2 发布了，Atom 是 Github 专门为程序员推出的一个跨平台文本编辑器。具有简洁和直观的图形用户界面，并有很多有趣的特点：...","commentCount":0,"href":"https://www.oschina.net/news/78094/github-atom-1-12-0-beta2","id":78094,"pubDate":"2016-10-16 07:29:27","recommend":false,"title":"Github Atom 1.12.0-beta2 发布","type":6,"viewCount":392},{"author":"局长","body":"FastJson 1.2.18 发布了，这是例行的Bug修复版本。fastjson 是一个性能很好的 Java 语言实现的 JSON 解析器和生成器，来自阿里巴巴的工程师开发。 ...","commentCount":1,"href":"https://www.oschina.net/news/78093/fastjson-1-2-18","id":78093,"pubDate":"2016-10-16 07:16:59","recommend":false,"title":"FastJson 1.2.18 发布，例行 Bug 修复版本","type":6,"viewCount":496},{"author":"局长","body":"Riot v2.6.4 和 v3.0.0-alpha.11 发布了，Riot.js是一个客户端模型-视图-呈现(MVP)框架并且它非常轻量级甚至小于1kb。尽管他的大小令人难以置信，所...","commentCount":0,"href":"https://www.oschina.net/news/78092/riot-v2-6-3","id":78092,"pubDate":"2016-10-16 07:09:47","recommend":false,"title":"Riot v2.6.4 和 v3.0.0-alpha.11 发布","type":6,"viewCount":164},{"author":"局长","body":"稳定版本 Wine 1.8.5 与开发版本 Wine 1.9.21 发布了，Wine 是一个伟大的项目，Wine(Wine Is Not an Emulator\u201d 的首字母缩写) 是一款让你在 Linu...","commentCount":7,"href":"https://www.oschina.net/news/78091/win-1-8-5-1-9-21","id":78091,"pubDate":"2016-10-16 07:02:15","recommend":false,"title":"稳定版 Wine 1.8.5 与开发版 Wine 1.9.21 发布","type":6,"viewCount":521},{"author":"局长","body":"Aurelia FrameWork 1.0.7 发布了，Aurelia FrameWork是下一代的 JavaScript 客户端框架，利用一些简单便利的措施来加强你的创造力。 本次主要的更新...","commentCount":0,"href":"https://www.oschina.net/news/78090/aurelia-framework-1-0-7","id":78090,"pubDate":"2016-10-16 06:51:54","recommend":false,"title":"Aurelia FrameWork 1.0.7，JavaScript客户端框架","type":6,"viewCount":312},{"author":"局长","body":"CakePHP 3.3.6 发布了，该版本修复了3.3分支中许多社区报告的问题。CakePHP 是一个运用了诸如ActiveRecord、Association Data Mapping、Front Con...","commentCount":2,"href":"https://www.oschina.net/news/78089/cakephp-3-3-6","id":78089,"pubDate":"2016-10-16 06:45:54","recommend":false,"title":"CakePHP 3.3.6 发布，改进 API 文档","type":6,"viewCount":185},{"author":"局长","body":"Apache Qpid Proton 0.15.0 发布了。Qpid Proton 是一个 AMQP 1.0 通讯库。高性能，轻量级，应用广泛。更新内容如下： 新特性和改进 PROTON-1224 ...","commentCount":0,"href":"https://www.oschina.net/news/78088/apache-qpid-proton-0-15-0","id":78088,"pubDate":"2016-10-16 06:38:31","recommend":false,"title":"Apache Qpid Proton 0.15.0，轻量通信库","type":6,"viewCount":313},{"author":"终于19岁","body":"Go 语言极速 web 框架 IRIS V4.1.1 发布了，更新如下： 4.5.2/.3 -> 4.6.0 This update affects only testers who used iris.Tester at the past...","commentCount":6,"href":"https://www.oschina.net/news/78087/go-web-iris-v4-6-0","id":78087,"pubDate":"2016-10-15 16:05:28","recommend":false,"title":"Go 语言极速 web 框架 IRIS V4.6.0 发布","type":6,"viewCount":1343}],"nextPageToken":"DBA816934CD0AA59","pageInfo":{"resultsPerPage":1,"totalResults":71691},"prevPageToken":"0997C855C600E421"}
     * time : 2016-10-16 16:49:51
     */


    /**
     * items : [{"author":"达尔文","body":"之前，Dimitri John Ledkov 在 Ubuntu 邮件列表 发送了一则消息，称将在 Ubuntu 18.10 中取消 32 位支持。他说越来越多的软件已经有了 64 位支持...","commentCount":16,"href":"https://www.oschina.net/news/78106/ubuntu-32-bit-support-drop","id":78106,"pubDate":"2016-10-16 08:50:47","recommend":true,"title":"Canonical 正考虑移除 Ubuntu 的 32 位支持","type":6,"viewCount":1449},{"author":"局长","body":"10秒总结全文：Cartographer是谷歌刚刚开源的使用激光雷达进行2D/3D SLAM的算法库。其算法本身未必拔萃，但从设计到实现都是产品级的，很可能会在S...","commentCount":4,"href":"https://www.oschina.net/news/78105/what-about-google-slam","id":78105,"pubDate":"2016-10-16 08:22:37","recommend":true,"title":"谷歌近期开源的 SLAM 方案在下一盘怎样的大棋？","type":6,"viewCount":1393},{"author":"达尔文","body":"GitHub 是如今所有开源事物的中央仓库, 这个网站最近发布了一个叫做《2016 Octoverse  状态报告》，详细列出了从去年起其一系列亮点, 包括总的活跃...","commentCount":4,"href":"https://www.oschina.net/translate/10-free-open-source-windows-tools-hosted-github","id":10003573,"pubDate":"2016-10-16 08:19:46","recommend":true,"title":"协作翻译 | GitHub 上10款免费开源 Windows 工具","type":4,"viewCount":2246},{"author":"达尔文","body":"听说三星停产Note7了，为什么呢？大概是生产线炸了吧。听说三星停售 Note7 了，为什么呢？可能是仓库炸了吧？听说三星开始召回 Note7 了，你退货了...","commentCount":20,"href":"https://my.oschina.net/xxiaobian/blog/759034","id":759034,"pubDate":"2016-10-16 08:17:27","recommend":true,"title":"OSChina 周日乱弹 \u2014\u2014 换妻，三星的体贴关怀","type":3,"viewCount":1803},{"author":"达尔文","body":"本文是使用 slf4j + log4j2 示例，由于 slf4j 只是一个统一接口包，log4j / log4j2 / logback 等都是有其实现类，所以本文中是以 slf4j 为例。若有...","commentCount":8,"href":"https://my.oschina.net/yzChen/blog/758984","id":758984,"pubDate":"2016-10-16 08:14:17","recommend":true,"title":"每日一博｜log4j2 之简化封装，告别静态成员变量","type":3,"viewCount":1097},{"author":"达尔文","body":"Fisplay 是客制化、简洁的看板管理展示工具。管理模块使用C#编写，展示模块使用html+php+css+js编写，数据库使用mysql。可以自定义展示的字段名称、...","commentCount":0,"href":"https://git.oschina.net/famio/Fisplay","id":78101,"pubDate":"2016-10-16 08:12:30","recommend":false,"title":"Git 项目推荐 | 自定义演示播放工具 Fisplay","type":0,"viewCount":6},{"author":"达尔文","body":"Tesseract.js 一个几乎能识别出图片中所有语言的JS库。","commentCount":3,"href":"https://www.oschina.net/p/tesseract-js","id":43621,"pubDate":"2016-10-16 08:08:26","recommend":false,"title":"Tesseract.js \u2014\u2014 识别图片语言的 JS 库 ","type":1,"viewCount":1070},{"author":"达尔文","body":"几个星期前，以色列针对iOS开发的\u201cPegasus\u201d间谍软件曝光，它使用三个被称为\u201cTrident\u201d的零日漏洞来攻击目标iOS设备，并且窃取其中信息。苹果立即...","commentCount":6,"href":"https://www.oschina.net/news/78099/ios-android","id":78099,"pubDate":"2016-10-16 08:00:46","recommend":false,"title":"微软高管：iOS 和 Android 一样脆弱","type":6,"viewCount":1271},{"author":"达尔文","body":"尽管当前闭源软件还大有作为，但计算行业正朝着开源的未来行进着。以微软、苹果和Facebook为代表的大企业，均对开源社区做出了大量的贡献，而Googl...","commentCount":1,"href":"https://www.oschina.net/news/78098/google-open-source-blog","id":78098,"pubDate":"2016-10-16 07:54:10","recommend":false,"title":"Google 公布首份\u201c开源成绩单\u201d","type":6,"viewCount":1430},{"author":"局长","body":"HHVM-3.12.10 和 HHVM-3.15.2 发布了，HipHop VM(HHVM)是 Facebook 推出的用来执行 PHP 代码的虚拟机，它是一个 PHP 的 JIT（Just-In- Time）编译器...","commentCount":2,"href":"https://www.oschina.net/news/78097/hvvm-3-12-10-and-3-15-2","id":78097,"pubDate":"2016-10-16 07:46:30","recommend":false,"title":"HHVM-3.12.10 和 HHVM-3.15.2 发布","type":6,"viewCount":711},{"author":"达尔文","body":"代码量算 KPI \u2026\u2026跟程序员们来这套？来自程序员\u2014\u2014这种神秘人类的囧事。","commentCount":21,"href":"https://www.oschina.net/news/78096/code-kpi","id":78096,"pubDate":"2016-10-16 07:42:41","recommend":false,"title":"拿代码量算 KPI \u2026\u2026跟程序员们来这套？","type":6,"viewCount":1636},{"author":"局长","body":"Node.js v6.8.1 (Current) 发布了。Node.js 是一套用来编写高性能网络服务器的 JavaScript 工具包，本次值得关注的更新如下： build: Fix buildin...","commentCount":3,"href":"https://www.oschina.net/news/78095/node-js-6-8-1","id":78095,"pubDate":"2016-10-16 07:36:07","recommend":false,"title":"Node.js v6.8.1 (Current) 发布，多个重要更新","type":6,"viewCount":708},{"author":"局长","body":"Github Atom 1.12.0-beta2 发布了，Atom 是 Github 专门为程序员推出的一个跨平台文本编辑器。具有简洁和直观的图形用户界面，并有很多有趣的特点：...","commentCount":0,"href":"https://www.oschina.net/news/78094/github-atom-1-12-0-beta2","id":78094,"pubDate":"2016-10-16 07:29:27","recommend":false,"title":"Github Atom 1.12.0-beta2 发布","type":6,"viewCount":392},{"author":"局长","body":"FastJson 1.2.18 发布了，这是例行的Bug修复版本。fastjson 是一个性能很好的 Java 语言实现的 JSON 解析器和生成器，来自阿里巴巴的工程师开发。 ...","commentCount":1,"href":"https://www.oschina.net/news/78093/fastjson-1-2-18","id":78093,"pubDate":"2016-10-16 07:16:59","recommend":false,"title":"FastJson 1.2.18 发布，例行 Bug 修复版本","type":6,"viewCount":496},{"author":"局长","body":"Riot v2.6.4 和 v3.0.0-alpha.11 发布了，Riot.js是一个客户端模型-视图-呈现(MVP)框架并且它非常轻量级甚至小于1kb。尽管他的大小令人难以置信，所...","commentCount":0,"href":"https://www.oschina.net/news/78092/riot-v2-6-3","id":78092,"pubDate":"2016-10-16 07:09:47","recommend":false,"title":"Riot v2.6.4 和 v3.0.0-alpha.11 发布","type":6,"viewCount":164},{"author":"局长","body":"稳定版本 Wine 1.8.5 与开发版本 Wine 1.9.21 发布了，Wine 是一个伟大的项目，Wine(Wine Is Not an Emulator\u201d 的首字母缩写) 是一款让你在 Linu...","commentCount":7,"href":"https://www.oschina.net/news/78091/win-1-8-5-1-9-21","id":78091,"pubDate":"2016-10-16 07:02:15","recommend":false,"title":"稳定版 Wine 1.8.5 与开发版 Wine 1.9.21 发布","type":6,"viewCount":521},{"author":"局长","body":"Aurelia FrameWork 1.0.7 发布了，Aurelia FrameWork是下一代的 JavaScript 客户端框架，利用一些简单便利的措施来加强你的创造力。 本次主要的更新...","commentCount":0,"href":"https://www.oschina.net/news/78090/aurelia-framework-1-0-7","id":78090,"pubDate":"2016-10-16 06:51:54","recommend":false,"title":"Aurelia FrameWork 1.0.7，JavaScript客户端框架","type":6,"viewCount":312},{"author":"局长","body":"CakePHP 3.3.6 发布了，该版本修复了3.3分支中许多社区报告的问题。CakePHP 是一个运用了诸如ActiveRecord、Association Data Mapping、Front Con...","commentCount":2,"href":"https://www.oschina.net/news/78089/cakephp-3-3-6","id":78089,"pubDate":"2016-10-16 06:45:54","recommend":false,"title":"CakePHP 3.3.6 发布，改进 API 文档","type":6,"viewCount":185},{"author":"局长","body":"Apache Qpid Proton 0.15.0 发布了。Qpid Proton 是一个 AMQP 1.0 通讯库。高性能，轻量级，应用广泛。更新内容如下： 新特性和改进 PROTON-1224 ...","commentCount":0,"href":"https://www.oschina.net/news/78088/apache-qpid-proton-0-15-0","id":78088,"pubDate":"2016-10-16 06:38:31","recommend":false,"title":"Apache Qpid Proton 0.15.0，轻量通信库","type":6,"viewCount":313},{"author":"终于19岁","body":"Go 语言极速 web 框架 IRIS V4.1.1 发布了，更新如下： 4.5.2/.3 -> 4.6.0 This update affects only testers who used iris.Tester at the past...","commentCount":6,"href":"https://www.oschina.net/news/78087/go-web-iris-v4-6-0","id":78087,"pubDate":"2016-10-15 16:05:28","recommend":false,"title":"Go 语言极速 web 框架 IRIS V4.6.0 发布","type":6,"viewCount":1343}]
     * nextPageToken : DBA816934CD0AA59
     * pageInfo : {"resultsPerPage":1,"totalResults":71691}
     * prevPageToken : 0997C855C600E421
     */

    private ResultBean result;
    private String     time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class ResultBean {
        private String          nextPageToken;
        /**
         * resultsPerPage : 1
         * totalResults : 71691
         */

        private PageInfoBean    pageInfo;
        private String          prevPageToken;
        /**
         * author : 达尔文
         * body : 之前，Dimitri John Ledkov 在 Ubuntu 邮件列表 发送了一则消息，称将在 Ubuntu 18.10 中取消 32 位支持。他说越来越多的软件已经有了 64 位支持...
         * commentCount : 16
         * href : https://www.oschina.net/news/78106/ubuntu-32-bit-support-drop
         * id : 78106
         * pubDate : 2016-10-16 08:50:47
         * recommend : true
         * title : Canonical 正考虑移除 Ubuntu 的 32 位支持
         * type : 6
         * viewCount : 1449
         */

        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public PageInfoBean getPageInfo() {
            return pageInfo;
        }

        public void setPageInfo(PageInfoBean pageInfo) {
            this.pageInfo = pageInfo;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class PageInfoBean {
            private int resultsPerPage;
            private int totalResults;

            public int getResultsPerPage() {
                return resultsPerPage;
            }

            public void setResultsPerPage(int resultsPerPage) {
                this.resultsPerPage = resultsPerPage;
            }

            public int getTotalResults() {
                return totalResults;
            }

            public void setTotalResults(int totalResults) {
                this.totalResults = totalResults;
            }
        }

        public static class ItemsBean {
            private String  author;
            private String  body;
            private int     commentCount;
            private String  href;
            private int     id;
            private String  pubDate;
            private boolean recommend;
            private String  title;
            private int     type;
            private int     viewCount;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }
    }
}
