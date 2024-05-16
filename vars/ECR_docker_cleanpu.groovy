def call(String aws_account_id, String region, String ecr_reponame){
    sh """
       docker rmi ${ecr_reponame}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest 
    """
}