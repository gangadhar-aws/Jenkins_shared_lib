def call(String aws_account_id, String region, String ecr_reponame){
    sh """
       docker rmi ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_reponame}:latest 
    """
}