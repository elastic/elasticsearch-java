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
import java.lang.String;
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

// typedef: _global.health_report.MasterIsStableIndicatorExceptionFetchingHistory

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.MasterIsStableIndicatorExceptionFetchingHistory">API
 *      specification</a>
 */
@JsonpDeserializable
public class MasterIsStableIndicatorExceptionFetchingHistory implements JsonpSerializable {
	private final String message;

	private final String stackTrace;

	// ---------------------------------------------------------------------------------------------

	private MasterIsStableIndicatorExceptionFetchingHistory(Builder builder) {

		this.message = ApiTypeHelper.requireNonNull(builder.message, this, "message");
		this.stackTrace = ApiTypeHelper.requireNonNull(builder.stackTrace, this, "stackTrace");

	}

	public static MasterIsStableIndicatorExceptionFetchingHistory of(
			Function<Builder, ObjectBuilder<MasterIsStableIndicatorExceptionFetchingHistory>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code message}
	 */
	public final String message() {
		return this.message;
	}

	/**
	 * Required - API name: {@code stack_trace}
	 */
	public final String stackTrace() {
		return this.stackTrace;
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

		generator.writeKey("message");
		generator.write(this.message);

		generator.writeKey("stack_trace");
		generator.write(this.stackTrace);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MasterIsStableIndicatorExceptionFetchingHistory}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MasterIsStableIndicatorExceptionFetchingHistory> {
		private String message;

		private String stackTrace;

		/**
		 * Required - API name: {@code message}
		 */
		public final Builder message(String value) {
			this.message = value;
			return this;
		}

		/**
		 * Required - API name: {@code stack_trace}
		 */
		public final Builder stackTrace(String value) {
			this.stackTrace = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MasterIsStableIndicatorExceptionFetchingHistory}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MasterIsStableIndicatorExceptionFetchingHistory build() {
			_checkSingleUse();

			return new MasterIsStableIndicatorExceptionFetchingHistory(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MasterIsStableIndicatorExceptionFetchingHistory}
	 */
	public static final JsonpDeserializer<MasterIsStableIndicatorExceptionFetchingHistory> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					MasterIsStableIndicatorExceptionFetchingHistory::setupMasterIsStableIndicatorExceptionFetchingHistoryDeserializer);

	protected static void setupMasterIsStableIndicatorExceptionFetchingHistoryDeserializer(
			ObjectDeserializer<MasterIsStableIndicatorExceptionFetchingHistory.Builder> op) {

		op.add(Builder::message, JsonpDeserializer.stringDeserializer(), "message");
		op.add(Builder::stackTrace, JsonpDeserializer.stringDeserializer(), "stack_trace");

	}

}
