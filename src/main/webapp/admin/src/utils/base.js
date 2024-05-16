const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmgo829/",
            name: "ssmgo829",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "基于Web的医院陪诊系统的设计与实现"
        } 
    }
}
export default base
