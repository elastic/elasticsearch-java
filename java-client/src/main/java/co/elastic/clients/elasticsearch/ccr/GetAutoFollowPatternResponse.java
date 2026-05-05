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

package co.elastic.clients.elasticsearch.ccr;

import co.elastic.clients.elasticsearch.ccr.get_auto_follow_pattern.AutoFollowPattern;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ccr.get_auto_follow_pattern.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ccr.get_auto_follow_pattern.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetAutoFollowPatternResponse implements JsonpSerializable {
	private final List<AutoFollowPattern> patterns;

	// ---------------------------------------------------------------------------------------------

	private GetAutoFollowPatternResponse(Builder builder) {

		this.patterns = ApiTypeHelper.unmodifiableRequired(builder.patterns, this, "patterns");

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

		if (ApiTypeHelper.isDefined(this.patterns)) {
			generator.writeKey("patterns");
			generator.writeStartArray();
			for (AutoFollowPattern item0 : this.patterns) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link GetAutoFollowPatternResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetAutoFollowPatternResponse> {
		private List<AutoFollowPattern> patterns;

		/**
		 * Required - API name: {@code patterns}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>patterns</code>.
		 */
		public final Builder patterns(List<AutoFollowPattern> list) {
			this.patterns = _listAddAll(this.patterns, list);
			return this;
		}

		/**
		 * Required - API name: {@code patterns}
		 * <p>
		 * Adds one or more values to <code>patterns</code>.
		 */
		public final Builder patterns(AutoFollowPattern value, AutoFollowPattern... values) {
			this.patterns = _listAdd(this.patterns, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code patterns}
		 * <p>
		 * Adds a value to <code>patterns</code> using a builder lambda.
		 */
		public final Builder patterns(Function<AutoFollowPattern.Builder, ObjectBuilder<AutoFollowPattern>> fn) {
			return patterns(fn.apply(new AutoFollowPattern.Builder()).build());
		}

		@Override
		protected Builder self() {
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
	public static final JsonpDeserializer<GetAutoFollowPatternResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetAutoFollowPatternResponse::setupGetAutoFollowPatternResponseDeserializer);

	protected static void setupGetAutoFollowPatternResponseDeserializer(
			ObjectDeserializer<GetAutoFollowPatternResponse.Builder> op) {

		op.add(Builder::patterns, JsonpDeserializer.arrayDeserializer(AutoFollowPattern._DESERIALIZER), "patterns");

	}

}
