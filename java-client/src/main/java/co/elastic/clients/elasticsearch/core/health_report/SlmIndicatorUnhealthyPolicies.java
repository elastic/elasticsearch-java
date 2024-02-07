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

package co.elastic.clients.elasticsearch.core.health_report;

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
import java.lang.Long;
import java.lang.String;
import java.util.Map;
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

// typedef: _global.health_report.SlmIndicatorUnhealthyPolicies

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.SlmIndicatorUnhealthyPolicies">API
 *      specification</a>
 */
@JsonpDeserializable
public class SlmIndicatorUnhealthyPolicies implements JsonpSerializable {
	private final long count;

	private final Map<String, Long> invocationsSinceLastSuccess;

	// ---------------------------------------------------------------------------------------------

	private SlmIndicatorUnhealthyPolicies(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");
		this.invocationsSinceLastSuccess = ApiTypeHelper.unmodifiable(builder.invocationsSinceLastSuccess);

	}

	public static SlmIndicatorUnhealthyPolicies of(Function<Builder, ObjectBuilder<SlmIndicatorUnhealthyPolicies>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * API name: {@code invocations_since_last_success}
	 */
	public final Map<String, Long> invocationsSinceLastSuccess() {
		return this.invocationsSinceLastSuccess;
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

		generator.writeKey("count");
		generator.write(this.count);

		if (ApiTypeHelper.isDefined(this.invocationsSinceLastSuccess)) {
			generator.writeKey("invocations_since_last_success");
			generator.writeStartObject();
			for (Map.Entry<String, Long> item0 : this.invocationsSinceLastSuccess.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

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
	 * Builder for {@link SlmIndicatorUnhealthyPolicies}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<SlmIndicatorUnhealthyPolicies> {
		private Long count;

		@Nullable
		private Map<String, Long> invocationsSinceLastSuccess;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code invocations_since_last_success}
		 * <p>
		 * Adds all entries of <code>map</code> to
		 * <code>invocationsSinceLastSuccess</code>.
		 */
		public final Builder invocationsSinceLastSuccess(Map<String, Long> map) {
			this.invocationsSinceLastSuccess = _mapPutAll(this.invocationsSinceLastSuccess, map);
			return this;
		}

		/**
		 * API name: {@code invocations_since_last_success}
		 * <p>
		 * Adds an entry to <code>invocationsSinceLastSuccess</code>.
		 */
		public final Builder invocationsSinceLastSuccess(String key, Long value) {
			this.invocationsSinceLastSuccess = _mapPut(this.invocationsSinceLastSuccess, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link SlmIndicatorUnhealthyPolicies}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public SlmIndicatorUnhealthyPolicies build() {
			_checkSingleUse();

			return new SlmIndicatorUnhealthyPolicies(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link SlmIndicatorUnhealthyPolicies}
	 */
	public static final JsonpDeserializer<SlmIndicatorUnhealthyPolicies> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, SlmIndicatorUnhealthyPolicies::setupSlmIndicatorUnhealthyPoliciesDeserializer);

	protected static void setupSlmIndicatorUnhealthyPoliciesDeserializer(
			ObjectDeserializer<SlmIndicatorUnhealthyPolicies.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::invocationsSinceLastSuccess,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.longDeserializer()),
				"invocations_since_last_success");

	}

}
