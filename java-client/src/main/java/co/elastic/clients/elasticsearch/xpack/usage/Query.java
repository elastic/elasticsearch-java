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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: xpack.usage.Query
public final class Query implements JsonpSerializable {
	@Nullable
	private final Number count;

	@Nullable
	private final Number failed;

	@Nullable
	private final Number paging;

	@Nullable
	private final Number total;

	// ---------------------------------------------------------------------------------------------

	public Query(Builder builder) {

		this.count = builder.count;
		this.failed = builder.failed;
		this.paging = builder.paging;
		this.total = builder.total;

	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public Number count() {
		return this.count;
	}

	/**
	 * API name: {@code failed}
	 */
	@Nullable
	public Number failed() {
		return this.failed;
	}

	/**
	 * API name: {@code paging}
	 */
	@Nullable
	public Number paging() {
		return this.paging;
	}

	/**
	 * API name: {@code total}
	 */
	@Nullable
	public Number total() {
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
			generator.write(this.count.doubleValue());

		}
		if (this.failed != null) {

			generator.writeKey("failed");
			generator.write(this.failed.doubleValue());

		}
		if (this.paging != null) {

			generator.writeKey("paging");
			generator.write(this.paging.doubleValue());

		}
		if (this.total != null) {

			generator.writeKey("total");
			generator.write(this.total.doubleValue());

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Query}.
	 */
	public static class Builder implements ObjectBuilder<Query> {
		@Nullable
		private Number count;

		@Nullable
		private Number failed;

		@Nullable
		private Number paging;

		@Nullable
		private Number total;

		/**
		 * API name: {@code count}
		 */
		public Builder count(@Nullable Number value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code failed}
		 */
		public Builder failed(@Nullable Number value) {
			this.failed = value;
			return this;
		}

		/**
		 * API name: {@code paging}
		 */
		public Builder paging(@Nullable Number value) {
			this.paging = value;
			return this;
		}

		/**
		 * API name: {@code total}
		 */
		public Builder total(@Nullable Number value) {
			this.total = value;
			return this;
		}

		/**
		 * Builds a {@link Query}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Query build() {

			return new Query(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Query}
	 */
	public static final JsonpDeserializer<Query> DESERIALIZER = ObjectBuilderDeserializer.createForObject(Builder::new,
			Query::setupQueryDeserializer);

	protected static void setupQueryDeserializer(DelegatingDeserializer<Query.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.numberDeserializer(), "count");
		op.add(Builder::failed, JsonpDeserializer.numberDeserializer(), "failed");
		op.add(Builder::paging, JsonpDeserializer.numberDeserializer(), "paging");
		op.add(Builder::total, JsonpDeserializer.numberDeserializer(), "total");

	}

}
