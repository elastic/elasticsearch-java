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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch.ccr.get_auto_follow_pattern.AutoFollowPattern;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ccr.get_auto_follow_pattern.Response
@JsonpDeserializable
public class GetAutoFollowPatternResponse implements JsonpSerializable {
	private final List<AutoFollowPattern> patterns;

	// ---------------------------------------------------------------------------------------------

	private GetAutoFollowPatternResponse(Builder builder) {

		this.patterns = ModelTypeHelper.unmodifiableRequired(builder.patterns, this, "patterns");

	}

	public static GetAutoFollowPatternResponse of(Function<Builder, ObjectBuilder<GetAutoFollowPatternResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code patterns}
	 */
	public final List<AutoFollowPattern> patterns() {
		return this.patterns;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (ModelTypeHelper.isDefined(this.patterns)) {
			generator.writeKey("patterns");
			generator.writeStartArray();
			for (AutoFollowPattern item0 : this.patterns) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAutoFollowPatternResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<GetAutoFollowPatternResponse> {
		private List<AutoFollowPattern> patterns;

		/**
		 * Required - API name: {@code patterns}
		 */
		public final Builder patterns(List<AutoFollowPattern> value) {
			this.patterns = value;
			return this;
		}

		/**
		 * Required - API name: {@code patterns}
		 */
		public final Builder patterns(AutoFollowPattern... value) {
			this.patterns = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - API name: {@code patterns}
		 */
		@SafeVarargs
		public final Builder patterns(Function<AutoFollowPattern.Builder, ObjectBuilder<AutoFollowPattern>>... fns) {
			this.patterns = new ArrayList<>(fns.length);
			for (Function<AutoFollowPattern.Builder, ObjectBuilder<AutoFollowPattern>> fn : fns) {
				this.patterns.add(fn.apply(new AutoFollowPattern.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link GetAutoFollowPatternResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetAutoFollowPatternResponse build() {
			_checkSingleUse();

			return new GetAutoFollowPatternResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetAutoFollowPatternResponse}
	 */
	public static final JsonpDeserializer<GetAutoFollowPatternResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, GetAutoFollowPatternResponse::setupGetAutoFollowPatternResponseDeserializer, Builder::build);

	protected static void setupGetAutoFollowPatternResponseDeserializer(
			DelegatingDeserializer<GetAutoFollowPatternResponse.Builder> op) {

		op.add(Builder::patterns, JsonpDeserializer.arrayDeserializer(AutoFollowPattern._DESERIALIZER), "patterns");

	}

}
