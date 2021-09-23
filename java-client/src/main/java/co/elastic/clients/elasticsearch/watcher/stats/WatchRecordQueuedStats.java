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

package co.elastic.clients.elasticsearch.watcher.stats;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: watcher.stats.WatchRecordQueuedStats
public class WatchRecordQueuedStats implements JsonpSerializable {
	private final String executionTime;

	// ---------------------------------------------------------------------------------------------

	public WatchRecordQueuedStats(AbstractBuilder<?> builder) {

		this.executionTime = Objects.requireNonNull(builder.executionTime, "execution_time");

	}

	/**
	 * API name: {@code execution_time}
	 */
	public String executionTime() {
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
		generator.write(this.executionTime);

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

			return new WatchRecordQueuedStats(this);
		}
	}

	protected abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>> {
		private String executionTime;

		/**
		 * API name: {@code execution_time}
		 */
		public BuilderT executionTime(String value) {
			this.executionTime = value;
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WatchRecordQueuedStats}
	 */
	public static final JsonpDeserializer<WatchRecordQueuedStats> DESERIALIZER = ObjectBuilderDeserializer
			.createForObject(Builder::new, WatchRecordQueuedStats::setupWatchRecordQueuedStatsDeserializer);

	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupWatchRecordQueuedStatsDeserializer(
			DelegatingDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::executionTime, JsonpDeserializer.stringDeserializer(), "execution_time");

	}

}
