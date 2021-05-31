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

package co.elastic.clients.elasticsearch.cluster.stats;

import co.elastic.clients.json.DelegatingJsonpValueParser;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpObjectBuilderParser;
import co.elastic.clients.json.JsonpObjectParser;
import co.elastic.clients.json.JsonpValueParser;
import co.elastic.clients.json.ToJsonp;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: cluster.stats.ClusterProcessCpu
public final class ClusterProcessCpu implements ToJsonp {
	private final Number percent;

	// ---------------------------------------------------------------------------------------------

	protected ClusterProcessCpu(Builder builder) {

		this.percent = Objects.requireNonNull(builder.percent, "percent");

	}

	/**
	 * API name: {@code percent}
	 */
	public Number percent() {
		return this.percent;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void toJsonp(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		toJsonpInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void toJsonpInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("percent");
		generator.write(this.percent.doubleValue());

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ClusterProcessCpu}.
	 */
	public static class Builder implements ObjectBuilder<ClusterProcessCpu> {
		private Number percent;

		/**
		 * API name: {@code percent}
		 */
		public Builder percent(Number value) {
			this.percent = value;
			return this;
		}

		/**
		 * Builds a {@link ClusterProcessCpu}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ClusterProcessCpu build() {

			return new ClusterProcessCpu(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json parser for ClusterProcessCpu
	 */
	public static final JsonpValueParser<ClusterProcessCpu> JSONP_PARSER = JsonpObjectBuilderParser
			.createForObject(Builder::new, ClusterProcessCpu::setupClusterProcessCpuParser);

	protected static void setupClusterProcessCpuParser(DelegatingJsonpValueParser<ClusterProcessCpu.Builder> op) {

		op.add(Builder::percent, JsonpValueParser.numberParser(), "percent");

	}

}
