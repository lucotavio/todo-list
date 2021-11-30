<template>
    
</template>

<script lang="ts">
import {Options, Vue} from 'vue-class-component'

@Options({})
export default class Todoform extends Vue{
    formInput = {title: "", completed: false}

    onSubmit(){
        console.log("Todo", this.formInput)
    }
}
</script>
