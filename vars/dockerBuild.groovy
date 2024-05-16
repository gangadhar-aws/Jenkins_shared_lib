def call(String project, String hubUser, String Imagetag){
    sh """
        docker image build -t ${hubUser}/${project} .
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:${Imagetag}
        docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}
    
