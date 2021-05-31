/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.transform;

import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuildFuncParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.StringEnum;
import co.elastic.clients.util.TaggedUnion;
import jakarta.json.stream.JsonGenerator;
import java.lang.Object;
import java.util.function.Function;
import javax.annotation.Nullable;

public class RetentionPolicyContainer extends TaggedUnion<RetentionPolicyContainer.Tag, Object> implements ToJsonp {

	public enum Tag implements StringEnum {

		time("time"),

		;

		private final String jsonValue;

		Tag(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

		public static StringEnum.JsonpParser<Tag> PARSER = new StringEnum.JsonpParser<>(Tag.values());
	}

	private RetentionPolicyContainer(Builder builder) {
		super(builder.$tag, builder.$variant);

	}

	/**
	 * Is this {@link RetentionPolicyContainer} of a {@code time} kind?
	 */
	public boolean isTime() {
		return is(Tag.time);
	}

	/**
	 * Get the {@code time} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code time} kind.
	 */
	public RetentionPolicy time() {
		return get(Tag.time);
	}

	@Override
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		generator.writeKey(tag.jsonValue);
		if (value instanceof ToJsonp) {
			((ToJsonp) value).toJsonp(generator, mapper);
		}

		generator.writeEnd();
	}
	public static class Builder {
		private Tag $tag;
		private Object $variant;

		public ObjectBuilder<RetentionPolicyContainer> time(RetentionPolicy v) {
			this.$variant = v;
			this.$tag = Tag.time;
			return new ObjectBuilder.Constant<>(this.build());
		}

		public ObjectBuilder<RetentionPolicyContainer> time(
				Function<RetentionPolicy.Builder, ObjectBuilder<RetentionPolicy>> f) {
			return this.time(f.apply(new RetentionPolicy.Builder()).build());
		}

		protected RetentionPolicyContainer build() {
			return new RetentionPolicyContainer(this);
		}

	}

	// Variants can be recursive data structures. Building the union's parser lazily
	// avoids cyclic dependencies between static class initialization code, which
	// can lead to unwanted things like NPEs or stack overflows

	public static final JsonpValueParser<RetentionPolicyContainer> JSONP_PARSER = JsonpValueParser
			.lazy(RetentionPolicyContainer::buildJsonpParser);

	private static JsonpValueParser<RetentionPolicyContainer> buildJsonpParser() {
		JsonpObjectParser<Builder> op = new JsonpObjectParser<>(Builder::new);

		op.add(Builder::time, RetentionPolicy.JSONP_PARSER, "time");

		return new JsonpObjectBuildFuncParser<>(op, Builder::build);
	}

}
