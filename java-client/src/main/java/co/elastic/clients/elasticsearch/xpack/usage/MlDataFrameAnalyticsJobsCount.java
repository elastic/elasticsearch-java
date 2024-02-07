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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.util.Objects;
import java.util.function.Function;

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

// typedef: xpack.usage.MlDataFrameAnalyticsJobsCount

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlDataFrameAnalyticsJobsCount">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlDataFrameAnalyticsJobsCount implements JsonpSerializable {
	private final long count;

	// ---------------------------------------------------------------------------------------------

	private MlDataFrameAnalyticsJobsCount(Builder builder) {

		this.count = ApiTypeHelper.requireNonNull(builder.count, this, "count");

	}

	public static MlDataFrameAnalyticsJobsCount of(Function<Builder, ObjectBuilder<MlDataFrameAnalyticsJobsCount>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
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

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsJobsCount}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlDataFrameAnalyticsJobsCount> {
		private Long count;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsJobsCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsJobsCount build() {
			_checkSingleUse();

			return new MlDataFrameAnalyticsJobsCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlDataFrameAnalyticsJobsCount}
	 */
	public static final JsonpDeserializer<MlDataFrameAnalyticsJobsCount> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlDataFrameAnalyticsJobsCount::setupMlDataFrameAnalyticsJobsCountDeserializer);

	protected static void setupMlDataFrameAnalyticsJobsCountDeserializer(
			ObjectDeserializer<MlDataFrameAnalyticsJobsCount.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
