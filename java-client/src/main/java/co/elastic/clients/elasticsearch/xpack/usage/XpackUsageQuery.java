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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
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

// typedef: xpack.usage.Query

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Query">API
 *      specification</a>
 */
@JsonpDeserializable
public class XpackUsageQuery implements JsonpSerializable {
	@Nullable
	private final Integer count;

	@Nullable
	private final Integer failed;

	@Nullable
	private final Integer paging;

	@Nullable
	private final Integer total;

	// ---------------------------------------------------------------------------------------------

	private XpackUsageQuery(Builder builder) {

		this.count = builder.count;
		this.failed = builder.failed;
		this.paging = builder.paging;
		this.total = builder.total;

	}

	public static XpackUsageQuery of(Function<Builder, ObjectBuilder<XpackUsageQuery>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public final Integer count() {
		return this.count;
	}

	/**
	 * API name: {@code failed}
	 */
	@Nullable
	public final Integer failed() {
		return this.failed;
	}

	/**
	 * API name: {@code paging}
	 */
	@Nullable
	public final Integer paging() {
		return this.paging;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public final Integer total() {
		return this.total;
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

		if (this.count != null) {
			generator.writeKey("count");
			generator.write(this.count);

		}
		if (this.failed != null) {
			generator.writeKey("failed");
			generator.write(this.failed);

		}
		if (this.paging != null) {
			generator.writeKey("paging");
			generator.write(this.paging);

		}
		if (this.total != null) {
			generator.writeKey("total");
			generator.write(this.total);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link XpackUsageQuery}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<XpackUsageQuery> {
		@Nullable
		private Integer count;

		@Nullable
		private Integer failed;

		@Nullable
		private Integer paging;

		@Nullable
		private Integer total;

		/**
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable Integer value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code failed}
		 */
		public final Builder failed(@Nullable Integer value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code paging}
		 */
		public final Builder paging(@Nullable Integer value) {
			this.paging = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public final Builder total(@Nullable Integer value) {
			this.total = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link XpackUsageQuery}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public XpackUsageQuery build() {
			_checkSingleUse();

			return new XpackUsageQuery(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link XpackUsageQuery}
	 */
	public static final JsonpDeserializer<XpackUsageQuery> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			XpackUsageQuery::setupXpackUsageQueryDeserializer);

	protected static void setupXpackUsageQueryDeserializer(ObjectDeserializer<XpackUsageQuery.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.integerDeserializer(), "count");
		op.add(Builder::failed, JsonpDeserializer.integerDeserializer(), "failed");
		op.add(Builder::paging, JsonpDeserializer.integerDeserializer(), "paging");
		op.add(Builder::total, JsonpDeserializer.integerDeserializer(), "total");

	}

}
