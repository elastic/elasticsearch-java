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

package co.elastic.clients.elasticsearch.async_search;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
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

// typedef: async_search._types.AsyncSearchResponseBase

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#async_search._types.AsyncSearchResponseBase">API
 *      specification</a>
 */

public abstract class AsyncSearchResponseBase implements JsonpSerializable {
	@Nullable
	private final String id;

	private final boolean isPartial;

	private final boolean isRunning;

	@Nullable
	private final DateTime expirationTime;

	private final long expirationTimeInMillis;

	@Nullable
	private final DateTime startTime;

	private final long startTimeInMillis;

	@Nullable
	private final DateTime completionTime;

	@Nullable
	private final Long completionTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	protected AsyncSearchResponseBase(AbstractBuilder<?> builder) {

		this.id = builder.id;
		this.isPartial = ApiTypeHelper.requireNonNull(builder.isPartial, this, "isPartial", false);
		this.isRunning = ApiTypeHelper.requireNonNull(builder.isRunning, this, "isRunning", false);
		this.expirationTime = builder.expirationTime;
		this.expirationTimeInMillis = ApiTypeHelper.requireNonNull(builder.expirationTimeInMillis, this,
				"expirationTimeInMillis", 0);
		this.startTime = builder.startTime;
		this.startTimeInMillis = ApiTypeHelper.requireNonNull(builder.startTimeInMillis, this, "startTimeInMillis", 0);
		this.completionTime = builder.completionTime;
		this.completionTimeInMillis = builder.completionTimeInMillis;

	}

	/**
	 * API name: {@code id}
	 */
	@Nullable
	public final String id() {
		return this.id;
	}

	/**
	 * Required - When the query is no longer running, this property indicates
	 * whether the search failed or was successfully completed on all shards. While
	 * the query is running, <code>is_partial</code> is always set to
	 * <code>true</code>.
	 * <p>
	 * API name: {@code is_partial}
	 */
	public final boolean isPartial() {
		return this.isPartial;
	}

	/**
	 * Required - Indicates whether the search is still running or has completed.
	 * <blockquote>
	 * <p>
	 * info If the search failed after some shards returned their results or the
	 * node that is coordinating the async search dies, results may be partial even
	 * though <code>is_running</code> is <code>false</code>.
	 * </p>
	 * </blockquote>
	 * <p>
	 * API name: {@code is_running}
	 */
	public final boolean isRunning() {
		return this.isRunning;
	}

	/**
	 * Indicates when the async search will expire.
	 * <p>
	 * API name: {@code expiration_time}
	 */
	@Nullable
	public final DateTime expirationTime() {
		return this.expirationTime;
	}

	/**
	 * Required - API name: {@code expiration_time_in_millis}
	 */
	public final long expirationTimeInMillis() {
		return this.expirationTimeInMillis;
	}

	/**
	 * API name: {@code start_time}
	 */
	@Nullable
	public final DateTime startTime() {
		return this.startTime;
	}

	/**
	 * Required - API name: {@code start_time_in_millis}
	 */
	public final long startTimeInMillis() {
		return this.startTimeInMillis;
	}

	/**
	 * Indicates when the async search completed. It is present only when the search
	 * has completed.
	 * <p>
	 * API name: {@code completion_time}
	 */
	@Nullable
	public final DateTime completionTime() {
		return this.completionTime;
	}

	/**
	 * API name: {@code completion_time_in_millis}
	 */
	@Nullable
	public final Long completionTimeInMillis() {
		return this.completionTimeInMillis;
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

		if (this.id != null) {
			generator.writeKey("id");
			generator.write(this.id);

		}
		generator.writeKey("is_partial");
		generator.write(this.isPartial);

		generator.writeKey("is_running");
		generator.write(this.isRunning);

		if (this.expirationTime != null) {
			generator.writeKey("expiration_time");
			this.expirationTime.serialize(generator, mapper);
		}
		generator.writeKey("expiration_time_in_millis");
		generator.write(this.expirationTimeInMillis);

		if (this.startTime != null) {
			generator.writeKey("start_time");
			this.startTime.serialize(generator, mapper);
		}
		generator.writeKey("start_time_in_millis");
		generator.write(this.startTimeInMillis);

		if (this.completionTime != null) {
			generator.writeKey("completion_time");
			this.completionTime.serialize(generator, mapper);
		}
		if (this.completionTimeInMillis != null) {
			generator.writeKey("completion_time_in_millis");
			generator.write(this.completionTimeInMillis);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		@Nullable
		private String id;

		private Boolean isPartial;

		private Boolean isRunning;

		@Nullable
		private DateTime expirationTime;

		private Long expirationTimeInMillis;

		@Nullable
		private DateTime startTime;

		private Long startTimeInMillis;

		@Nullable
		private DateTime completionTime;

		@Nullable
		private Long completionTimeInMillis;

		/**
		 * API name: {@code id}
		 */
		public final BuilderT id(@Nullable String value) {
			this.id = value;
			return self();
		}

		/**
		 * Required - When the query is no longer running, this property indicates
		 * whether the search failed or was successfully completed on all shards. While
		 * the query is running, <code>is_partial</code> is always set to
		 * <code>true</code>.
		 * <p>
		 * API name: {@code is_partial}
		 */
		public final BuilderT isPartial(boolean value) {
			this.isPartial = value;
			return self();
		}

		/**
		 * Required - Indicates whether the search is still running or has completed.
		 * <blockquote>
		 * <p>
		 * info If the search failed after some shards returned their results or the
		 * node that is coordinating the async search dies, results may be partial even
		 * though <code>is_running</code> is <code>false</code>.
		 * </p>
		 * </blockquote>
		 * <p>
		 * API name: {@code is_running}
		 */
		public final BuilderT isRunning(boolean value) {
			this.isRunning = value;
			return self();
		}

		/**
		 * Indicates when the async search will expire.
		 * <p>
		 * API name: {@code expiration_time}
		 */
		public final BuilderT expirationTime(@Nullable DateTime value) {
			this.expirationTime = value;
			return self();
		}

		/**
		 * Required - API name: {@code expiration_time_in_millis}
		 */
		public final BuilderT expirationTimeInMillis(long value) {
			this.expirationTimeInMillis = value;
			return self();
		}

		/**
		 * API name: {@code start_time}
		 */
		public final BuilderT startTime(@Nullable DateTime value) {
			this.startTime = value;
			return self();
		}

		/**
		 * Required - API name: {@code start_time_in_millis}
		 */
		public final BuilderT startTimeInMillis(long value) {
			this.startTimeInMillis = value;
			return self();
		}

		/**
		 * Indicates when the async search completed. It is present only when the search
		 * has completed.
		 * <p>
		 * API name: {@code completion_time}
		 */
		public final BuilderT completionTime(@Nullable DateTime value) {
			this.completionTime = value;
			return self();
		}

		/**
		 * API name: {@code completion_time_in_millis}
		 */
		public final BuilderT completionTimeInMillis(@Nullable Long value) {
			this.completionTimeInMillis = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupAsyncSearchResponseBaseDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::id, JsonpDeserializer.stringDeserializer(), "id");
		op.add(AbstractBuilder::isPartial, JsonpDeserializer.booleanDeserializer(), "is_partial");
		op.add(AbstractBuilder::isRunning, JsonpDeserializer.booleanDeserializer(), "is_running");
		op.add(AbstractBuilder::expirationTime, DateTime._DESERIALIZER, "expiration_time");
		op.add(AbstractBuilder::expirationTimeInMillis, JsonpDeserializer.longDeserializer(),
				"expiration_time_in_millis");
		op.add(AbstractBuilder::startTime, DateTime._DESERIALIZER, "start_time");
		op.add(AbstractBuilder::startTimeInMillis, JsonpDeserializer.longDeserializer(), "start_time_in_millis");
		op.add(AbstractBuilder::completionTime, DateTime._DESERIALIZER, "completion_time");
		op.add(AbstractBuilder::completionTimeInMillis, JsonpDeserializer.longDeserializer(),
				"completion_time_in_millis");

	}

}
