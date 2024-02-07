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

package co.elastic.clients.elasticsearch.watcher.stats;

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

// typedef: watcher.stats.WatchRecordQueuedStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#watcher.stats.WatchRecordQueuedStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class WatchRecordQueuedStats implements JsonpSerializable {
	private final DateTime executionTime;

	// ---------------------------------------------------------------------------------------------

	protected WatchRecordQueuedStats(AbstractBuilder<?> builder) {

		this.executionTime = ApiTypeHelper.requireNonNull(builder.executionTime, this, "executionTime");

	}

	public static WatchRecordQueuedStats watchRecordQueuedStatsOf(
			Function<Builder, ObjectBuilder<WatchRecordQueuedStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code execution_time}
	 */
	public final DateTime executionTime() {
		return this.executionTime;
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

		generator.writeKey("execution_time");
		this.executionTime.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WatchRecordQueuedStats}.
	 */

	public static class Builder extends WatchRecordQueuedStats.AbstractBuilder<Builder>
			implements
				ObjectBuilder<WatchRecordQueuedStats> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WatchRecordQueuedStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WatchRecordQueuedStats build() {
			_checkSingleUse();

			return new WatchRecordQueuedStats(this);
		}
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		private DateTime executionTime;

		/**
		 * Required - API name: {@code execution_time}
		 */
		public final BuilderT executionTime(DateTime value) {
			this.executionTime = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatchRecordQueuedStats}
	 */
	public static final JsonpDeserializer<WatchRecordQueuedStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WatchRecordQueuedStats::setupWatchRecordQueuedStatsDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWatchRecordQueuedStatsDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::executionTime, DateTime._DESERIALIZER, "execution_time");

	}

}
