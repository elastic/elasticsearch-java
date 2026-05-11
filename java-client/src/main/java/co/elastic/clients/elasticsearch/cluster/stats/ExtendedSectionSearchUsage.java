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

package co.elastic.clients.elasticsearch.cluster.stats;

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

// typedef: cluster.stats.ExtendedSectionSearchUsage

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.stats.ExtendedSectionSearchUsage">API
 *      specification</a>
 */
@JsonpDeserializable
public class ExtendedSectionSearchUsage implements JsonpSerializable {
	private final Map<SortType, Long> sort;

	// ---------------------------------------------------------------------------------------------

	private ExtendedSectionSearchUsage(Builder builder) {

		this.sort = ApiTypeHelper.unmodifiable(builder.sort);

	}

	public static ExtendedSectionSearchUsage of(Function<Builder, ObjectBuilder<ExtendedSectionSearchUsage>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code sort}
	 */
	public final Map<SortType, Long> sort() {
		return this.sort;
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

		if (ApiTypeHelper.isDefined(this.sort)) {
			generator.writeKey("sort");
			generator.writeStartObject();
			for (Map.Entry<SortType, Long> item0 : this.sort.entrySet()) {
				generator.writeKey(item0.getKey().jsonValue());
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
	 * Builder for {@link ExtendedSectionSearchUsage}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ExtendedSectionSearchUsage> {
		@Nullable
		private Map<SortType, Long> sort;

		public Builder() {
		}
		private Builder(ExtendedSectionSearchUsage instance) {
			this.sort = instance.sort;

		}
		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>sort</code>.
		 */
		public final Builder sort(Map<SortType, Long> map) {
			this.sort = _mapPutAll(this.sort, map);
			return this;
		}

		/**
		 * API name: {@code sort}
		 * <p>
		 * Adds an entry to <code>sort</code>.
		 */
		public final Builder sort(SortType key, Long value) {
			this.sort = _mapPut(this.sort, key, value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ExtendedSectionSearchUsage}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExtendedSectionSearchUsage build() {
			_checkSingleUse();

			return new ExtendedSectionSearchUsage(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExtendedSectionSearchUsage}
	 */
	public static final JsonpDeserializer<ExtendedSectionSearchUsage> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExtendedSectionSearchUsage::setupExtendedSectionSearchUsageDeserializer);

	protected static void setupExtendedSectionSearchUsageDeserializer(
			ObjectDeserializer<ExtendedSectionSearchUsage.Builder> op) {

		op.add(Builder::sort,
				JsonpDeserializer.enumMapDeserializer(SortType._DESERIALIZER, JsonpDeserializer.longDeserializer()),
				"sort");

	}

}
